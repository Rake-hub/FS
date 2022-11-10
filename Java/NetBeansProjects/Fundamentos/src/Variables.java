/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tarde
 */
public class Variables {
    
    int numero;             //Instancia
    static String nombre;   //Clase
    //static significa que no necesitas crearte un objeto
    
    	public static void main(String[] args){
            
            //Variable de instancia
            Variables v= new Variables();
            v.numero=5;
            
            
            Variables.nombre="Java es facil";
            
            float PI=3.14f;
            
            System.out.println(PI);
            System.out.println(v.numero);
            System.out.println("Nombre: "+ Variables.nombre);
            
            
            
		/*EN FUNCIÓN DEL ALMACENAMIENTO
            
                NUMERICAS:
                    ENTERAS   --> byte,short,int,long
                    REALES    --> float,double
                CARACTER  --> char
                BOOLEANAS --> boolean
            
                EN JAVA LOS STRING SON OBJETOS
                (clase String)
                */
                
                /*
                EN FUNCIÓN DE LA POSICIÓN DENTRO DE LA CLASE
                
                1.Variables de Instancia
                    Dentro de la clase, fuera de los métodos, no hace falta
                    inicializarlas, para acceder a ellas hace falta un objeto.
                2.Variables de clase
                    Para acceder a ellas no es necesario un objeto.
                3.Variables locales
                    Dentro de los métodos, inicializar antes de usar.
                
                Para poder acceder a cualquier atributo ométodo hace falta
                un objeto --> objeto().atributo
                */
	}
}
