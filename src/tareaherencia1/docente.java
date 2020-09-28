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
public class docente extends persona{
    
    
    private int legajo;
    private int antiguedad;

    public docente( String nombre, String apellido, long dni, int legajo, int antiguedad) {
        super(nombre, apellido, dni);
        this.legajo = legajo;
        this.antiguedad = antiguedad;
    }

    public docente(String nombre, String apellido, long dni) {
        super(nombre, apellido, dni);
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getLegajo() {
        return legajo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
    
   @Override
    public void mostrar() {
    
    System.out.println( "*DATOS DEL DOCENTE");
    System.out.println( "*NOMBRE:" + getNombre() +" "+ "APELLIDO:" + getApellido() +" "+ "LEGAJO:" + getLegajo() +" "+ 
            "ANTIGUEDAD:" + antiguedad  );
    System.out.println(" ");
    }
    
}
