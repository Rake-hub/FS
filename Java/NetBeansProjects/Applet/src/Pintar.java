
import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.green;
import static java.awt.Color.red;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.TextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tarde
 */
public class Pintar extends Applet {

    static int tam = 10;
    static Color color = black;
    Button b;
    static int cont = 0;

    public void init() {

        b = new Button("Color");
        b.setBackground(Color.red);
        this.add(b);
        Choice tamano = new Choice();
        tamano.add("10");
        tamano.add("20");
        tamano.add("30");
        tamano.add("40");
        add(tamano);
    }

    public boolean action(Event e, Object obj) {
        Graphics g = this.getGraphics();

        if (obj.equals("Color")) {

            if (cont % 2 == 0) {
                color = red;
            }
            if (cont % 2 == 1) {
                color = black;
            }
            cont++;
        }

        if (obj.equals("10")) {
            tam = 10;
        }
        if (obj.equals("20")) {
            tam = 20;
        }
        if (obj.equals("30")) {
            tam = 30;
        }
        if (obj.equals("40")) {
            tam = 40;
        }
        return true;
    }

    public boolean mouseDown(Event e, int x, int y) {
        Graphics g = this.getGraphics();
        g.setColor(color);
        g.fillRect(x - tam / 2, y - tam / 2, tam, tam);

        return true;
    }

}
