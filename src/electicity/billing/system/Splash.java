package electicity.billing.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    Thread t;
    Splash() {
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/elect.jpg"));
        Image i2 =i1.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        setVisible(true);
        
        int a = 1;
        for (int i = 2; i < 600; i+=4, a+=1) {
            setSize(i + a,i);
            setLocation(700 - ((i + a)/2), 400 - (i/2));
            try {
                Thread.sleep(5);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        t = new Thread(this);
        t.start();
       
        setVisible(true);
    }
    
    public void run() {
        try {
            Thread.sleep(7000);
            setVisible(false);
            
            
            new Login();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new Splash();
    }
}
