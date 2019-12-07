package helloworldgui2;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class HelloWorldGUI2 {
    private static JFrame window;
    private static String wordA;
   
   private static class HelloWorldDisplay extends JPanel {
       
      private ImageIcon icon;
      public void paintComponent(Graphics g) {
         super.paintComponent(g);
         g.drawString( wordA, 20, 30 );
         g.drawImage(icon.getImage(), 20, 50, 100, 100, this);
         
      }
      public HelloWorldDisplay(){
          super();
          icon = new ImageIcon("/Users/god/NetBeansProjects/HelloWorldGUI2/src/helloworldgui2/spongebob.jpg");
      }
      
   }
   
   private static class ButtonHandler implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         int x = (int)(Math.random() * 600);
         int y = (int)(Math.random() * 600);
         window.setLocation(x,y);
      }
   }
   
   public static void main(String[] args) {
      
      HelloWorldDisplay displayPanel = new HelloWorldDisplay();
      JButton okButton = new JButton("button");
      ButtonHandler listener = new ButtonHandler();
      okButton.addActionListener(listener);

      JPanel content = new JPanel();
      content.setLayout(new BorderLayout());
      content.add(displayPanel, BorderLayout.CENTER);
      content.add(okButton, BorderLayout.WEST);
      
      wordA = JOptionPane.showInputDialog("Enter a word");

      window = new JFrame(wordA);
      
      window.setContentPane(content);
      window.setSize(250,100);
      window.setLocation(100,100);
      window.setVisible(true);
      
   }
   
}