/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.ILibroDao;
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
public class LibroDao implements ILibroDao {

    private List<Libro> listaLibro;
    private String ruta = "libros.dat";

    public LibroDao() {
        listaLibro = load(ruta);
    }

    @Override
    public void create(Libro libro) {
        listaLibro.add(libro);
        save(ruta);
    }

    @Override
    public Libro read(int id) {
        for (Libro libro : listaLibro) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }
    

    @Override
    public void delete(int id) {
        for (int i = 0; i < listaLibro.size(); i++) {
            Libro libroBuscado = listaLibro.get(i);
            if (libroBuscado.getId() == id) {
                listaLibro.remove(i);
                save(ruta);
                break;
            }

        }
    }

    @Override
    public void update(int id, Libro libro) {
        for (int i = 0; i < listaLibro.size(); i++) {
            Libro libroBuscado = listaLibro.get(i);
            if (libroBuscado.getId() == id) {
                listaLibro.set(i, libro);
                save(ruta);
                break;
            }

        }
    }

    @Override
    public List<Libro> list() {
        return listaLibro;

    }

    @Override
    public Libro prestar(int id) {
        
        for (Libro libro : listaLibro) {
            if (libro.getId() == id && libro.isDisponible()) {
                libro.setDisponible(false);  // Cambia la disponibilidad a false, indicando que el libro está prestado
                save(ruta);
                return libro;
            }
        }
        return null; 
    }

    @Override
    public Libro devolver(int id) {
        for (Libro libro : listaLibro) {
            if (libro.getId() == id && !libro.isDisponible()) {
                libro.setDisponible(true);  // Cambia la disponibilidad a true, indicando que el libro está disponible
                save(ruta);
                return libro;
            }
        }
        return null;
    }
    
    @Override
    public void save(String ruta) {
        try {
            FileOutputStream archivo = new FileOutputStream(ruta);
            ObjectOutputStream streamSalida = new ObjectOutputStream(archivo);
            streamSalida.writeObject(listaLibro);
        } catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Archivo '"+ruta+"' no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error de escritura en el archivo '"+ruta+"'", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error general al guardar el archivo :'"+ruta+"'", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    @Override
    public List<Libro> load(String ruta) {
        List<Libro> libros = new ArrayList<>();
        try  {
            FileInputStream archivo = new FileInputStream(ruta);
            ObjectInputStream streamEntrada = new ObjectInputStream(archivo);
            libros = (List<Libro>) streamEntrada.readObject();
        } catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Archivo '"+ruta+"' no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error de lectura en el archivo '"+ruta+"'.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error general al cargar el archivo :'"+ruta+"'", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        return libros;

    }
    
}
