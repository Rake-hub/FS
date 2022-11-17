
import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tarde
 */
public class Pong extends Applet implements Runnable {

    Thread t;
    int x, y;
    int xPosition, yPosition;
    int a, b;

    public void init() {
        xPosition = 700; //Posición
        yPosition = 100;
        x = 20; //Velocidad
        y = 6;
        a = 20;
        b = 20;
    }

    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }

    public void stop() {
        if (t != null) {
            t.stop();
            t = null;
        }
    }

    public void paint(Graphics g) {
        g.fillRect(200, a, 20, 140);
        g.fillRect(1400, b, 20, 140);

        if (xPosition > (1400 - 20)) {
            x = -x;
        }
        if (xPosition < (200 + 20)) {
            x = -x;
        }
        if (yPosition > (this.size().height * 1 - 20 - 40)) {
            y = -y;
        }
        if (yPosition < (20)) {
            y = -y;
        }
        xPosition += x;
        yPosition += y;

        g.fillOval(xPosition, yPosition, 20, 20);

    }

    public boolean keyDown(Event e, int key) {
        switch (key) {

            case Event.UP:
                b -= 10;
                break;
            case Event.DOWN:
                b += 10;
                break;

            case 119:
                a -= 10;
                break;
            case 115:
                a += 10;

        }
        //repaint(); //Borra pantalla, llama a paint
        return true;
    }

    @Override
    public void run() {
        while (true) {
         //   x += 5;
            //y += 2;

            try {
                t.sleep(100);
            } catch (Exception ex) {
            }
            repaint();
        }
    }

}
