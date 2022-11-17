package Coche;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import static java.awt.SystemColor.menu;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

/*
public interface WindowListener{
    public void WindowOpened(WindowEvent e);
    public void WindowOClosed(WindowEvent e);
    public void WindowClosing(WindowEvent e);
    public void WindowActivated(WindowEvent e);
    public void WindowDeactivated(WindowEvent e);
    public void WindowIconified(WindowEvent e);
    public void WindowDeiconified(WindowEvent e);
}
*/


/**
 *
 * @author tarde
 */
public class MenuBaseDeDatos extends JFrame implements ActionListener {

    MenuBar mbarra;
    Menu m1;
    MenuItem m11, m12, m13, m14;
    Menu m2;
    MenuItem m21, m22, m23, m24;
    Menu m3;
    MenuItem m31;
    Menu m4;
    MenuItem m41, m42;

    Label estado;
    TextArea ta;

    public MenuBaseDeDatos() {
        this.setTitle("Base de Datos");
        this.setLayout(new BorderLayout());

        estado = new Label("Estado: ");
        estado.setBackground(Color.green);
        ta = new TextArea();
        ta.setBackground(Color.black);
        ta.setForeground(Color.green);

        //Crear menu
        mbarra = new MenuBar();
        m1 = new Menu("BD");
        m11 = new MenuItem("Cargar DRV");
        m12 = new MenuItem("Conectar");
        m13 = new MenuItem("Desconectar");
        m14 = new MenuItem("Salir");
        m2 = new Menu("Sentencias");
        m21 = new MenuItem("Alta");
        m22 = new MenuItem("Baja");
        m23 = new MenuItem("Modificar");
        m24 = new MenuItem("Consultar tabla");
        m3 = new Menu("Precompilar");
        m31 = new MenuItem("Buscardor");
        m4 = new Menu("Transacciones");
        m41 = new MenuItem("Insertar");
        m42 = new MenuItem("Commit");

        //añadir menu
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.addSeparator();
        m1.add(m14);
        mbarra.add(m1);

        m2.add(m21);
        m2.add(m22);
        m2.add(m23);
        m2.add(m24);
        mbarra.add(m2);

        m3.add(m31);
        mbarra.add(m3);

        m4.add(m41);
        m4.add(m42);
        mbarra.add(m4);

        this.setMenuBar(mbarra);

        this.add("South", estado);
        this.add("Center", ta);

        this.setSize(800, 600);
        //this.setLayout(new BorderLayout());
        this.setVisible(true);
        this.setResizable(false);

        //botones funcionales
        m11.addActionListener(this);
        m12.addActionListener(this);
        m13.addActionListener(this);
        m14.addActionListener(this);
        m21.addActionListener(this);
        m22.addActionListener(this);
        m23.addActionListener(this);
        m24.addActionListener(this);
        m31.addActionListener(this);
        m41.addActionListener(this);
        m42.addActionListener(this);

    }

    public static void main(String[] args) {
        new MenuBaseDeDatos();
    }

    public void actionPerformed(ActionEvent e) {
        estado.setText("Estado: ");

        if (e.getSource() == m11) {
            estado.setText(estado.getText() + "Pulsado...");
        }

        if (e.getSource() == m21) {
            new Alta().setVisible(true);
        }
        
                if (e.getSource() == m24) {
            new Consultar().setVisible(true);
        }

    }

}
