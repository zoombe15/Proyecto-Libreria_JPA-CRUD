/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis=new ControladoraPersistencia();
    public void guardar(String nombre, String categoria, double precio, String miembro, String nombre_cliente, String dni, String dirección) {
       
        Cliente cl=new Cliente();
        cl.setNombre_cliente(nombre_cliente);
        cl.setDni(dni);
        cl.setDirección(dirección);
        
        Libro l=new Libro();
        l.setNombre(nombre);
        l.setCategoria(categoria);
        l.setPrecio(precio);
        l.setMiembro(miembro);
        l.setUnCliente(cl);
        
        controlPersis.guardare(cl,l);
        
        
        
        
    }
    
}
