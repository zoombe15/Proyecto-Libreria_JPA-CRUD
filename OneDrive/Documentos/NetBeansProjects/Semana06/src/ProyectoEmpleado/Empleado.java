/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoEmpleado;

import java.text.DecimalFormat;

public abstract class Empleado {
    //Atributos 
    protected String dni;
    protected String nombre;
    protected String apellidos;

    
    //--Contructores
    public Empleado() {
    }
    
    public Empleado(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    //--Encapsulamiento de datos - Metodos Getter and Setter
    
    public String getDni()                      {return dni;}

    public void setDni(String dni)              {this.dni = dni;}

    public String getNombre()                   {return nombre;}

    public void setNombre(String nombre)        {this.nombre = nombre;}

    public String getApellidos()                {return apellidos;}

    public void setApellidos(String apellidos)  {this.apellidos = apellidos;}
    
    //---Informacion que se mostrara en el jFrame
    
    public String mostrarInfo(){
        DecimalFormat df=new DecimalFormat("##0.00");
        return      "\nNombres\t\t: "           + getNombre()                     + 
                    "\nApellidos\t\t: "         + getApellidos()                  +
                    "\nDni\t\t: "               + getDni()                        +
                    "\nIngresos\t\t: "          + df.format(ingresos()    ) +
                    "\nBonificaciones\t\t: "    + df.format(bonificaciones()) +
                    "\nDescuento\t\t: "         + df.format(descuento()   ) ;
    }
    
    public double sueldoNeto(){
        return ingresos()+bonificaciones()-descuento();
    }
    
    //--Metodos Abstractos
    
    public abstract double ingresos();
    
    public abstract double bonificaciones();
    
    public abstract double descuento();
    
    
}
