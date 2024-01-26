/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Prestamo;
import java.util.List;

/**
 *
 * @author ferna
 */
public interface IPrestamoDao {
    void create(Prestamo prestamo );
    Prestamo read(int id);
    void delete(int id);
    void update(int id,Prestamo prestamo);
    List<Prestamo> list();
    void save(String ruta);
    List<Prestamo> load(String ruta);
}
