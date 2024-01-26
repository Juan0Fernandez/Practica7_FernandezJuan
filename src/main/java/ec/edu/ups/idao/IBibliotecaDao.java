/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Biblioteca;
import java.util.List;

/**
 *
 * @author ferna
 */
public interface IBibliotecaDao {
    void create(Biblioteca biblioteca );
    Biblioteca read(int id);
    void delete(int id);
    void update(int id,Biblioteca bibliteca);
    List<Biblioteca> list();
    void save(String ruta);
    List<Biblioteca> load(String ruta);
    
}
