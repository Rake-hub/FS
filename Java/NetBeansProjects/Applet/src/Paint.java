
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
public class Paint extends Applet {

    int x, y;
    int a = 0, b = 360;
    int cont = 0;
    int velocidad = 10;

    //Pintar bola
    public void paint(Graphics g) {
        
        if(x<-30) x=this.size().width*2;
        if(x>this.size().width*2) x=-30;
        if(y<-30) y=this.size().height*2;
        if(y>this.size().height*2) y=-30;
        
        
        g.setColor(Color.yellow);
        if (cont % 2 == 0) {
            g.fillArc(this.size().width / 2 - 50 + x, this.size().height / 2 - 50 + y, 100, 100, a, b);
        }
        if (cont % 2 == 1) {
            g.fillOval(this.size().width / 2 - 50 + x, this.size().height / 2 - 50 + y, 100, 100);
        }

        g.setColor(Color.black);
        g.fillOval(this.size().width / 2 - 15 + x, this.size().height / 2 - 30 + y, 20, 20);
        cont++;

    }

    public boolean keyDown(Event e, int key) {
        switch (key) {
            case Event.LEFT:
                x -= velocidad;
                a = 30;
                b = 300;
                break;
            case Event.UP:
                y -= velocidad;
                a = 30;
                b = 300;
                break;
            case Event.DOWN:
                y += velocidad;
                a = 30;
                b = 300;
                break;
            case Event.RIGHT:
                x += velocidad;
                a = 30;
                b = 300;
        }

        repaint(); //Borra pantalla, llama a paint

        return true;
    }

}
