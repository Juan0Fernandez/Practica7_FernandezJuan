/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.IPrestamoDao;
import ec.edu.ups.modelo.Libro;
import ec.edu.ups.modelo.Prestamo;
import ec.edu.ups.modelo.Usuario;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ferna
 */
public class PrestamoControlador {
     private IPrestamoDao prestamoDao;
    private Prestamo prestamo;

    
    public PrestamoControlador(IPrestamoDao prestamoDao) {
        this.prestamoDao = prestamoDao;
    }    
    public void create(int id, Libro libro, Usuario usuario, String fechaDePrestamo) {
        prestamo = new Prestamo(id, libro, usuario,fechaDePrestamo );
        prestamoDao.create(prestamo);
        //se crea la lista en la base de datos
    }
    public Prestamo read(int codigo) {
        prestamo = prestamoDao.read(codigo);
        return prestamo;
    }
    public void update(int id, Libro libro, Usuario usuario, String fechaPrestamo) {
        prestamo = prestamoDao.read(id);
        prestamo.setLibro(libro);
        prestamo.setUsuario(usuario);
        prestamo.setFechaPrestamo(fechaPrestamo);
        prestamoDao.update(id, prestamo);
    }
    public void delete(int codigo) {
        prestamo = prestamoDao.read(codigo);
        prestamoDao.delete(prestamo.getId());
    }
    public List<Prestamo> list() {
        return prestamoDao.list();
    }    

}
