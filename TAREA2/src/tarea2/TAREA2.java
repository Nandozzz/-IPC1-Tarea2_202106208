
package tarea2;

import java.util.Scanner;
public class TAREA2 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); 
    
  
    Usuario[] personaje = new Usuario[10];
    
    
    personaje[0]= new Usuario("202106208","Dwight","Chinchilla");
    
    
    Ventana login = new Ventana(personaje);
    login.setVisible(true);
        
    
   
   
    }
    
}
