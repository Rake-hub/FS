
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
public class Media {

    public static int[] rellenar(int notas[], int n) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0 ; i < notas.length; i++) {
            n = sc.nextInt();
            if ((n <= 10) && (n >= 0)) {
                notas[i] = n;
            } else {
                System.out.println("Número incorrecto");
                i--;
            }
        }
        return notas;
    }

    public static void main(String[] args) {
        /*Calcula la media de las notas de 3 alumnos teniendo en cuenta
        que se han de meter números y no cadenas de caracteres
        (NumberFormatException*/

        
        int notas[] = new int[3];
        int n=0;
        int media1 = 0;

        System.out.println("Introduce las notas:");

        try {
            rellenar(notas,n);

        } catch (Exception e) {
            System.out.println(" ");
            System.out.println("Tienes que introducir números");
            System.out.println("Reinicio:");

            rellenar(notas,n);
        }

        for (int i = 0; i < notas.length; i++) {
            media1 += notas[i];
        }
        double media = ((double) media1) / notas.length;

        
        System.out.println(" ");
        System.out.println("La media es: " + media);
    }

}
