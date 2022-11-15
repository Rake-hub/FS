
import java.applet.Applet;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tarde
 */
public class TextoMovimiento extends Applet implements Runnable {

    Thread t;
    int x;
    int y;

    public void init() {
        x = 10;
        y = 10;
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
        g.setColor(Color.yellow);
        g.setFont(new Font("Arial",Font.PLAIN,25));
        g.drawString("Java", x, y);
    }

    public void run() {

        while (true) {
            x += 5;
            y += 1;
            try {
                t.sleep(150);
            } catch (Exception ex) {
            }
            repaint();
        }
    }

}
