
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
public class CirculoYCuadrado extends Applet {
    static int tam=10;

    public boolean mouseDown(Event e, int x, int y) {
        Graphics g=this.getGraphics();

        if (x>this.size().width/2) {
            g.fillRect(x-tam/2,y-tam/2,tam,tam);
        }else {g.setColor(Color.green); g.fillOval(x-tam/2,y-tam/2,tam,tam);}
        
        tam++;
        return true;
    }
    
    
        public boolean mouseDrag(Event e, int x, int y) {
        Graphics g=this.getGraphics();
        int tam=20;

            g.fillRect(x-tam/2,y-tam/2,tam,tam);
        
        return true;
    }

}
