/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Libro;

/**
 *
 * @author ferna
 */
public interface IPrestable {
    Libro prestar(int id);//Metodo para prestar
    Libro devolver(int id);//Metodo para devolver
   
}
