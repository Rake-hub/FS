
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tarde
 */
public class Coordenadas extends JFrame  {

    JLabel a,b;
    JTextField a2,b2;
    JPanel jp;

    public Coordenadas() {
        this.setTitle("Coordenanas");
        a = new JLabel("X: ");
        a2 = new JTextField(5);
        b = new JLabel("Y: ");
        b2 = new JTextField(5);
        jp=new JPanel();
        jp.setBackground(Color.orange);
        
        this.add(a);
        this.add(a2);
        this.add(b);
        this.add(b2);
        jp.add(a);
        jp.add(a2);
        jp.add(b);
        jp.add(b2);
        this.add("North",jp);
        this.addMouseListener(new Raton());
        
        this.setSize(700, 600);
        //this.setLayout(new BorderLayout());
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Coordenadas();
    }
    
    class Raton extends MouseAdapter{
        
        public void mouseClicked(MouseEvent e) {
            a2.setText(String.valueOf(e.getX()));
            b2.setText(String.valueOf(e.getY()));
    }

}

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

}
