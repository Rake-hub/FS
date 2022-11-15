
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
/*Los applets no pueden estar enpaquetados

Todos los métodos de los applets son de respuesta
los implementa el programador y los ejecuta la JVM
como el método public static void main

El init solo se ejecuta una vez 
 */
public class MiApplet extends Applet {

    static String paises[] = {"España", "Francia", "Alemania", "Rusia"};

    public static void paises(Graphics g) {
        for (int i = 0; i < paises.length; i++) {
            g.drawString(paises[i], 10, (i + 2) * 25);
        }
    }

    public void init() {
        this.setBackground(Color.yellow);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 22));
        g.drawString("Hoy es Lunes", 10, 25);
        paises(g);

        g.drawLine(0, 150, 1000, 150);
        g.drawRect(100, 100, 200, 100);
        g.setColor(Color.green);
        g.fillRect(200, 200, 200, 100);
        g.setColor(Color.blue);
        g.fillOval(400, 30, 100, 100);
        g.drawRoundRect(320, 100, 200, 200, 20, 20);
        g.setColor(Color.black);
        g.fillArc(300, 320, 300, 300, 30, 300);
    }

}
