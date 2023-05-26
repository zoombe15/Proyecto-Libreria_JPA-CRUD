/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Cliente;
import Logica.Libro;


public class ControladoraPersistencia {

  ClienteJpaController jpaCliente=new ClienteJpaController();
  LibroJpaController jpaLibro=new LibroJpaController();
    public void guardare(Cliente cl, Libro l) {
        jpaCliente.create(cl);
        jpaLibro.create(l);
    }
    
}
