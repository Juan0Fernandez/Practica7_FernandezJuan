/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IUsuarioDao;
import ec.edu.ups.modelo.Usuario;
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
public class UsuarioDao implements IUsuarioDao {
    
    private List<Usuario> listaUsuario;
    private String ruta = "usuarios.dat";

    public UsuarioDao() {
        listaUsuario = load(ruta);

    }
    
    @Override
    public void create(Usuario usuario) {
        listaUsuario.add(usuario);
        save(ruta);
    }

    @Override
    public Usuario read(String id) {
        for (Usuario usuario : listaUsuario) {
            if (usuario.getIdentificacion().equals(id) ) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public void delete(String id) {
        for (int i = 0; i < listaUsuario.size(); i++) {
            Usuario usuarioBuscado = listaUsuario.get(i);
            if (usuarioBuscado.getIdentificacion().equals(id)) {
                listaUsuario.remove(i);
                save(ruta);
                break;
            }

        }
    }

    @Override
    public void update(String id, Usuario usuario) {
        for (int i = 0; i < listaUsuario.size(); i++) {
            Usuario usuarioBuscado = listaUsuario.get(i);
            if (usuarioBuscado.getIdentificacion().equals(id)) {
                listaUsuario.set(i, usuario);
                save(ruta);
                break;
            }

        }
    }

    @Override
    public List<Usuario> list() {
         return listaUsuario;
    }
    
    @Override
    public void save(String ruta) {
        try {
            FileOutputStream archivo = new FileOutputStream(ruta);
            ObjectOutputStream streamSalida = new ObjectOutputStream(archivo);
            streamSalida.writeObject(listaUsuario);
        } catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Archivo '"+ruta+"' no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error de escritura en el archivo '"+ruta+"'", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error general al guardar el archivo :'"+ruta+"'", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    @Override
    public List<Usuario> load(String ruta) {
        List<Usuario> usuarios = new ArrayList<>();
        try  {
            FileInputStream archivo = new FileInputStream(ruta);
            ObjectInputStream streamEntrada = new ObjectInputStream(archivo);
            usuarios = (List<Usuario>) streamEntrada.readObject();
        } catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Archivo '"+ruta+"' no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error de lectura en el archivo '"+ruta+"'.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error general al cargar el archivo :'"+ruta+"'", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        return usuarios;

    }
    
}
