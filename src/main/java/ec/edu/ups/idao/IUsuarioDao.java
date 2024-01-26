/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Usuario;
import java.util.List;

/**
 *
 * @author ferna
 */
public interface IUsuarioDao {
   void create(Usuario usuario );
    Usuario read(String id);
    void delete(String id);
    void update(String id,Usuario usuario);
    List<Usuario> list();
    void save(String ruta);
    List<Usuario> load(String ruta);
}
