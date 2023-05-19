/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoEmpleado;

public class EmpleadoPermanente extends Empleado{
    
    private double sueldoBase;
    private String afiliacion;

    public EmpleadoPermanente(double sueldoBase, String afiliacion, String dni, String nombre, String apellidos) {
        super(dni, nombre, apellidos);
        this.sueldoBase = sueldoBase;
        this.afiliacion = afiliacion;
    }

    public double getSueldoBase()                       { return sueldoBase;}

    public void setSueldoBase(double sueldoBase)        {this.sueldoBase = sueldoBase;}

    public String getAfiliacion()                       {return afiliacion;}

    public void setAfiliacion(String afiliacion)        {this.afiliacion = afiliacion;}
    
    @Override
    public double ingresos(){
        return getSueldoBase();
    }
    
    @Override
    public double bonificaciones(){
        return 0;
    }
    
    @Override
    public double descuento(){
        if (getAfiliacion().equalsIgnoreCase ("AFP"))
            return getSueldoBase()*0.15;
        else 
            return getSueldoBase()*0.11;
    }
    
    
    @Override
    public String mostrarInfo(){return "EMPLEADO PERMANENTE: \n"+super.mostrarInfo();}
    
    
    public double movilidad(){
        if (ingresos()<1000)
            return 50;
        else
            return 40;
    }
    
    
    
}
