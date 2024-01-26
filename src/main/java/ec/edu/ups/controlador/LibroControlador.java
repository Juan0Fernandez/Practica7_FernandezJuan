/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.ILibroDao;
import ec.edu.ups.modelo.Libro;
import java.util.List;

/**
 *
 * @author ferna
 */
public class LibroControlador {

    private ILibroDao libroDao;
    private Libro libro;

    public LibroControlador(ILibroDao libroDao) {
        this.libroDao = libroDao;
    }

    public void create(int id, String titulo, String autor, int año, boolean disponible) {
        libro = new Libro(id, titulo, autor, año, disponible);
        libroDao.create(libro);
        //se crea la lista en la base de datos
    }

    public Libro read(int codigo) {
        libro = libroDao.read(codigo);
        return libro;

    }

    public void update(int id, String titulo, String autor, int año, boolean disponible) {
        libro = libroDao.read(id);
        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setId(id);
        libro.setAño(año);
        libro.setDisponible(disponible);
        libroDao.update(id, libro);
    }

    public void delete(int codigo) {
        libro = libroDao.read(codigo);
        libroDao.delete(libro.getId());
    }

    public List<Libro> list() {
        return libroDao.list();
    }

    public Libro prestar(int codigo) {
        libro = libroDao.prestar(codigo);
        return libro;
        

    }
    public Libro devolver(int codigo) {
        libro = libroDao.devolver(codigo);
        return libro;

    }
    
}
