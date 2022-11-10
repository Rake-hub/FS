
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
public class Leer {

    public static String porTeclado() {
        String cadena = null;
        Scanner sc=new Scanner(System.in);
        cadena = sc.nextLine();
        return cadena;
    }
}
