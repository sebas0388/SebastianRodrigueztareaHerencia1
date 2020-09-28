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
public class alumno extends persona {
    
   private int padron;
   private float notas;
   

    public alumno( String nombre, String apellido, long dni, int padron) {
        super(nombre, apellido, dni);
        this.padron = padron;
    }

    public alumno(String nombre, String apellido, long dni) {
        super(nombre, apellido, dni);
    }

    public void setPadron(int padron) {
        this.padron = padron;
    }

    public void setNotas(float notas) {
        this.notas = notas;
    }

    public int getPadron() {
        return padron;
    }

    public float getNotas() {
        return notas;
    }
   
    
   @Override
    public void mostrar() {
    
    System.out.println( "*DATOS DEL ALUMNO");
    System.out.println( "*NOMBRE:" + getNombre() +" "+ "APELLIDO:" + getApellido() +" "+ "DNI:" + getDni() +" "+ 
            "PADRON:" + padron +" "+ "PROMEDIO:" + notas );
    System.out.println( "");
    }
   
    
}
