
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tarde
 */
public class crearAnimal {
    public static void main(String[] args) {
            Animal perro=new Animal("Mamifero",5,false);
            
            System.out.println(perro.getEspecie());
            System.out.println(perro.getEdad());
            System.out.println(perro.isSalvaje());
            
            Animal gato=new Animal();
            gato.setEspecie("Mamifero");
            gato.setEdad(2);
            gato.setSalvaje(true);
            
            System.out.println(gato.toString());
           
        
    }

    
    
    
}
