
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tarde
 */
public class EntradaPorTeclado {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un texto:");
        
        String texto=Leer.porTeclado();
        System.out.println("\nEl texto introducido es:\n"+texto);
    }
    
}
