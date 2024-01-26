/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.IUsuarioDao;
import ec.edu.ups.modelo.Usuario;
import java.util.List;

/**
 *
 * @author ferna
 */
public class UsuarioControlador {
      private IUsuarioDao usuarioDao;
    private Usuario usuario;

    
    public UsuarioControlador(IUsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }
    
    public void create(String identificacion,String nombre,String apellido,String correo) {
        usuario = new Usuario(identificacion,nombre,apellido,correo);
        usuarioDao.create(usuario);
        //se crea la lista en la base de datos
    }
    public Usuario read(String codigo) {
        usuario = usuarioDao.read(codigo);
        return usuario;
    }
    public void update(String identificacion, String nombre,String apellido,String correo) {
        usuario = usuarioDao.read(identificacion);
        usuario.setNombre(nombre);
        usuario.setCorreo(correo);
        usuario.setApellido(apellido);
        usuarioDao.update(identificacion, usuario);
    }

    public void delete(String codigo) {
        usuario = usuarioDao.read(codigo);
        usuarioDao.delete(usuario.getIdentificacion());
    }
    public List<Usuario> list() {
        return usuarioDao.list();
    }
    
}
