/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Libro;
import java.util.List;


/**
 *
 * @author ferna
 */
public interface ILibroDao extends IPrestable {
    void create(Libro libro );
    Libro read(int id);
    void delete(int id);
    void update(int id,Libro libro);
    List<Libro> list();
    void save(String ruta);
    List<Libro> load(String ruta);
    
}
