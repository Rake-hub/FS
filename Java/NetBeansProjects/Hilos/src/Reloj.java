
import java.applet.Applet;
import java.awt.Color;
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
public class Reloj extends Applet implements Runnable {

    Date fecha;
    Thread t;
    String h, m, s;

    public void init() {
        h = "0";
        m = "0";
        s = "0";

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
        g.setColor(Color.orange);
        g.fillRoundRect(90, 60, 180, 50, 20, 20);
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.PLAIN, 40));
        if (Integer.parseInt(s) < 10) {
            s = "0" + s;
        }
        if (Integer.parseInt(h) < 10) {
            h = "0" + h;
        }
        if (Integer.parseInt(m) < 10) {
            m = "0" + m;
        }
        g.drawString(h + ":" + m + ":" + s, 100, 100);

    }

    @Override
    public void run() {
        while (true) {
            fecha = new Date();
            h = Integer.toString(fecha.getHours());
            m = Integer.toString(fecha.getMinutes());
            s = Integer.toString(fecha.getSeconds());
            try {
                t.sleep(1000);
            } catch (Exception ex) {
            }
            repaint();
        }
    }

}
