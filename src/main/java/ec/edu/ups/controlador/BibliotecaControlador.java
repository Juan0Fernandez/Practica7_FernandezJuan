/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.IBibliotecaDao;
import ec.edu.ups.modelo.Biblioteca;
import java.util.List;

/**
 *
 * @author ferna
 */
public class BibliotecaControlador {

    private IBibliotecaDao bibliotecaDao;
    private Biblioteca biblioteca;

    public BibliotecaControlador(IBibliotecaDao bibliotecaDao) {
        this.bibliotecaDao = bibliotecaDao;
    }

    public void create(int id, String nombre, String direccion, String telefono) {
        biblioteca = new Biblioteca(id, nombre, direccion, telefono);
        bibliotecaDao.create(biblioteca);
        //se crea la lista en la base de datos
    }

    public Biblioteca read(int codigo) {
        biblioteca = bibliotecaDao.read(codigo);
        return biblioteca;

    }

    public void update(int codigo, String nombre, String direccion, String telefono) {
        biblioteca = bibliotecaDao.read(codigo);
        biblioteca.setNombre(nombre);
        biblioteca.setDireccion(direccion);
        biblioteca.setTelefono(telefono);
        bibliotecaDao.update(codigo, biblioteca);
    }

    public void delete(int codigo) {
        biblioteca = bibliotecaDao.read(codigo);
        bibliotecaDao.delete(biblioteca.getId());
    }

    public List<Biblioteca> list() {
        return bibliotecaDao.list();
    }
}
