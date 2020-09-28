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
public class tareaHerencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     persona P1 = new persona( "Laura", "Mansilla", 26541986);   
     alumno A1 = new alumno( "Ludmila", "Rodriguez", 18934267, 12354);
     docente D1 = new docente ( "Mario", "Gimenez", 45361729, 2033, 5  );
     
     
     P1.mostrar();
     A1.mostrar();
     D1.mostrar();
     
    }
    
}
