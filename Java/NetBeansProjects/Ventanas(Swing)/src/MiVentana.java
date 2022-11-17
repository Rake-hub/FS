
import java.awt.Button;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tarde
 */
public class MiVentana extends Frame implements ActionListener {

    Button t;
    TextField txt;
    Button v;
    Button jb;
    static int a = 0;
    Vacio b;

    public MiVentana() {
        this.setTitle("Mi ventana");
        t = new Button("Pulsar");
        v = new Button("Ventana");
        jb = new Button("Pulsar2");
        txt = new TextField(20);
        t.addActionListener(this);
        v.addActionListener(this);
        jb.addActionListener(this);
        txt.addActionListener(this);
        this.add(t);
        this.add(txt);
        this.add(v);
        this.add(jb);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new MiVentana();
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == t) {  
            txt.setText("Pulsado...");
        }

        if (e.getSource() == v) {
            if(b!=null) b.dispose();
            b=new Vacio();     
            txt.setText("Pulsado...");
        }
        
        if(e.getSource()==jb){
        txt.setText("Pulsado...");}
        
                if(e.getSource()==txt){
        txt.setText("");}
    }

}
