
import java.util.ArrayList;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tarde
 */
public class Colecciones {

    public static void main(String[] args) {
        
        Vector v = new Vector();
        
        Animal tiburon = new Animal("Anfibio", 3, true);
        v.add(tiburon);
        Animal perro = new Animal("Mamifero", 6, false);
        v.add(perro);

        //extraer el objeto del vector       
        for (int i = 0; i < v.size(); i++) {
            Animal a = (Animal) v.elementAt(i);
            System.out.println(a.toString());            
        }
        
        ArrayList<Animal> animales;
        animales = new ArrayList();
        
        Animal tiburon2 = new Animal("Anfibio", 3, true);
        animales.add(tiburon2);
        Animal perro2 = new Animal("Mamifero", 6, false);
        animales.add(perro2);
        //animales.set(2, perro2);
        
        for (int i = 0; i < v.size(); i++) {
            Animal a = (Animal) animales.get(i);
            System.out.println(a.toString());            
        }
        
    }
    
}
