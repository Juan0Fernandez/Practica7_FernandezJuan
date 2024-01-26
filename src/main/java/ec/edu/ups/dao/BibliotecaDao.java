/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IBibliotecaDao;
import ec.edu.ups.modelo.Biblioteca;
import ec.edu.ups.modelo.Libro;
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
public class BibliotecaDao implements IBibliotecaDao {

    private List<Biblioteca> listaBiblioteca;
    private String ruta = "biblotecas.dat";

    public BibliotecaDao() {
        listaBiblioteca = load(ruta);

    }


    @Override
    public void create(Biblioteca biblioteca) {
        listaBiblioteca.add(biblioteca);
        save(ruta);
    }

    @Override
    public Biblioteca read(int id) {
        for (Biblioteca biblioteca : listaBiblioteca) {
            if (biblioteca.getId() == id) {
                return biblioteca;
            }
        }
        return null;
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < listaBiblioteca.size(); i++) {
            Biblioteca bibliotecaBuscada = listaBiblioteca.get(i);
            if (bibliotecaBuscada.getId() == id) {
                listaBiblioteca.remove(i);
                save(ruta);
                break;
            }

        }
    }

    @Override
    public void update(int id, Biblioteca bibliteca) {
        for (int i = 0; i < listaBiblioteca.size(); i++) {
            Biblioteca bibliotecaBuscada = listaBiblioteca.get(i);
            if (bibliotecaBuscada.getId() == id) {
                listaBiblioteca.set(i, bibliteca);
                save(ruta);
                break;
            }
        }
    }

    @Override
    public List<Biblioteca> list() {
        return listaBiblioteca;
    }

    @Override
    public void save(String ruta) {
        try {
            FileOutputStream archivo = new FileOutputStream(ruta);
            ObjectOutputStream streamSalida = new ObjectOutputStream(archivo);
            streamSalida.writeObject(listaBiblioteca);
        } catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Archivo '"+ruta+"' no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error de escritura en el archivo '"+ruta+"'", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error general al guardar el archivo :'"+ruta+"'", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    @Override
    public List<Biblioteca> load(String ruta) {
        List<Biblioteca> bibliotecas = new ArrayList<>();
        try  {
            FileInputStream archivo = new FileInputStream(ruta);
            ObjectInputStream streamEntrada = new ObjectInputStream(archivo);
            bibliotecas = (List<Biblioteca>) streamEntrada.readObject();
        } catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Archivo '"+ruta+"' no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error de lectura en el archivo '"+ruta+"'.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error general al cargar el archivo :'"+ruta+"'", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        return bibliotecas;

    }
}
