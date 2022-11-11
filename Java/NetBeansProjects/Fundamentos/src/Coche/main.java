/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coche;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author tarde
 */
public class main {

    static Scanner sc = new Scanner(System.in);
    static Vector v = new Vector();

    public static void crearCoche() {
        Coche coche = new Coche();
        System.out.println("Creación de coche:");
        System.out.println(" ");

        System.out.println("Introduce marca:");
        String marca = sc.next();
        coche.setMarca(marca);
        System.out.println("Introduce modelo:");
        String modelo = sc.next();
        coche.setModelo(modelo);
        System.out.println("Introduce motor:");
        try {
            int motor = sc.nextInt();
            coche.setMotor(motor);
            v.add(coche);
        } catch (Exception e) {
            System.out.println("El motor tiene que ser un número");
            sc = new Scanner(System.in);
        }

        
    }

    public static void listarCoche() {
        for (int i = 0; i < v.size(); i++) {
            Coche coche = (Coche) v.elementAt(i);
            System.out.println(coche.toString());
        }
    }

    public static void main(String[] args) {
        int i = 0;

        do {

            System.out.println("Introduce una opción");
            System.out.println("1: Crear coche");
            System.out.println("2: Mostrar coches");
            System.out.println("3: Salir");
            i = Integer.parseInt(sc.next());

            switch (i) {
                case 1:
                    crearCoche();
                    System.out.println(" ");
                    break;
                case 2:
                    listarCoche();
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Comando no reconocido");
                    System.out.println(" ");
            }
        } while (i != 3);

    }
}
