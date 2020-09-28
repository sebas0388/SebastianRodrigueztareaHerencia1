/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaherencia1;

/**
 *
 * @author SebastianR
 */
public class persona {
    
    
    private String nombre;
    private String apellido;
    private long dni;

    
    
    public persona() {
    
    }
    
    public persona(String nombre, String apellido, long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getDni() {
        return dni;
    }
    
    
   public void mostrar () {

       System.out.println( "NOMBRE:" + nombre +" "+ "APELLIDO:" + apellido +" "+ "dni:" + dni );
       System.out.println( " ");
} 
    
    
    
    
    
}
