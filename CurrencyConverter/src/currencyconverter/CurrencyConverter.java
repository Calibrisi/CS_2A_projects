package currencyconverter;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CurrencyConverter {
    private JFrame window;
    private String wordA;
    private JFormattedTextField input;
//    private TextField input;
//    private TextArea nyet;
    private TextField output;
    private DecimalFormat inputFormat;
    
        
    private class USDButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Double d = Double.parseDouble(input.getText());
            d = d * 1.1;
            output.setText(d.toString());
      }
   }
    
    private class EuroButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Double d = Double.parseDouble(input.getText());
            d = d * .9;
            output.setText(d.toString());
      }
   }
    
    public void run() {
      
      JButton USDbutt = new JButton("euro to USD");
      JButton eurobutt = new JButton("USD to euro");
      USDButtonHandler USDlistener = new USDButtonHandler();
      USDbutt.addActionListener(USDlistener);
      EuroButtonHandler eurolistener = new EuroButtonHandler();
      eurobutt.addActionListener(eurolistener);
      inputFormat = new DecimalFormat("0.00");
      input = new JFormattedTextField(inputFormat);
      output = new TextField();
      
      
      JPanel content = new JPanel();
      content.setLayout(new BoxLayout(content, BoxLayout.PAGE_AXIS));
      content.add(USDbutt);
      content.add(eurobutt);
      content.add(new JLabel("starting currency"));
      content.add(input);
      content.add(new JLabel("converted currency"));
      content.add(output);
      
      window = new JFrame("Choose a currency to convert to");
      
      window.setContentPane(content);
      window.setSize(200,200);
      window.setLocation(500,500);
      window.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        CurrencyConverter c = new CurrencyConverter();
        c.run();
    }
    


}