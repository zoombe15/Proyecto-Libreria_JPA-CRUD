/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoEmpleado;

public class EmpleadoVendedor extends Empleado {
    //--Atributos
    
    private double montoVendido;
    private double tasaComision;
    
    //--Contructores de Clase padre(Empleado) y EmpleadoVendedor
    
    public EmpleadoVendedor(double montoVendido, double tasaComision, String dni, String nombre, String apellidos) {
        super(dni, nombre, apellidos);
        this.montoVendido = montoVendido;
        this.tasaComision = tasaComision;
    }

    //--Metodos de encapsulamiento - Getter and Setter
    
    public double getMontoVendido()                     {return montoVendido;}

    public void setMontoVendido(double montoVendido)    {this.montoVendido = montoVendido;}

    public double getTasaComision()                     {return tasaComision;}

    public void setTasaComision(double tasaComision)    {this.tasaComision = tasaComision;}

    
    //--Metodos traidos de clase padre (Empleado)
    
    @Override
    public double ingresos()    {return getMontoVendido()*getTasaComision();}
    
    @Override
    public double bonificaciones(){
        if (getMontoVendido()< 1000)
            return 0;
        else  
            if(getMontoVendido()< 5000)
                return ingresos()*0.05;
             else 
                return ingresos()*0.10;
        
    }
    
    @Override
    public double descuento(){
        if (ingresos()< 1000)
            return ingresos()*0.11;
        else 
            return ingresos()*0.15;
 
    }
    
    //-- Mostrar informacion traida del metodo PADRE
    
    
    @Override
    public String mostrarInfo(){return "EMPLEADO PERMANENTE:  \n"+super.mostrarInfo();}


}
