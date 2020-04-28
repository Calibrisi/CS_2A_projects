package multithreading;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Multithreading extends Thread {
    private int T;

    Multithreading(int g)
    {
        T = g;
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Multithreading(i).start();
            
        }
    }
    
    public void run() {
        int X = (int) (Math.random() * 1000);
        int Y = (int) (Math.random() * 600);
        final JOptionPane pane = new JOptionPane("Multithreading" + T);
        final JDialog d = pane.createDialog((JFrame)null, "Title");
        d.setLocation(X, Y);
        d.setVisible(true);
    }
    
}
