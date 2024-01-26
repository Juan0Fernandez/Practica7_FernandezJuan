/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IPrestamoDao;
import ec.edu.ups.modelo.Prestamo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class PrestamoDao implements IPrestamoDao {
    
    private List<Prestamo> listaPrestamo;
    private String ruta = "prestamo.dat";
    
    public PrestamoDao() {
        listaPrestamo = load(ruta);

    }
    
    @Override
    public void create(Prestamo prestamo) {
        listaPrestamo.add(prestamo);
        save(ruta);
    }

    @Override
    public Prestamo read(int id) {
        for (Prestamo prestamo : listaPrestamo) {
            if (prestamo.getId() == id) {
                return prestamo;
            }
        }
        return null;
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < listaPrestamo.size(); i++) {
            Prestamo prestamoBuscado = listaPrestamo.get(i);
            if (prestamoBuscado.getId() == id) {
                listaPrestamo.remove(i);
                save(ruta);
                break;
            }

        }
    }

    @Override
    public void update(int id, Prestamo prestamo) {
        for (int i = 0; i < listaPrestamo.size(); i++) {
            Prestamo prestamoBuscado = listaPrestamo.get(i);
            if (prestamoBuscado.getId() == id) {
                listaPrestamo.set(i, prestamo);
                save(ruta);
                break;
            }

        }
    }

    @Override
    public List<Prestamo> list() {
         return listaPrestamo;
    }
    
    @Override
    public void save(String ruta) {
        try {
            FileOutputStream archivo = new FileOutputStream(ruta);
            ObjectOutputStream streamSalida = new ObjectOutputStream(archivo);
            streamSalida.writeObject(listaPrestamo);
        } catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Archivo '"+ruta+"' no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error de escritura en el archivo '"+ruta+"'", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error general al guardar el archivo :'"+ruta+"'", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    @Override
    public List<Prestamo> load(String ruta) {
        List<Prestamo> prestamos = new ArrayList<>();
        try  {
            FileInputStream archivo = new FileInputStream(ruta);
            ObjectInputStream streamEntrada = new ObjectInputStream(archivo);
            prestamos = (List<Prestamo>) streamEntrada.readObject();
        } catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Archivo '"+ruta+"' no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error de lectura en el archivo '"+ruta+"'.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error general al cargar el archivo :'"+ruta+"'", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        return prestamos;

    }
    
}
