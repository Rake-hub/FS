
import java.applet.Applet;
import java.awt.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tarde
 */
public class Boton extends Applet{
    
    Button b;
    TextField txt;
    
    public void init(){
        
        b=new Button("Pulsar");
        txt=new TextField(15);
        this.add(b);
        this.add(txt);
    }
    
    public boolean action(Event e, Object obj){
        
        if(obj.equals("Pulsar")){
        txt.setText("Botón pulsado");
    }
        return true;
    }
    
}
