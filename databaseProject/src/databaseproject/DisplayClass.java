package databaseproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DisplayClass {
    public static void NameSpeciesAge(ArrayList<Animal> animals){
        String toDisp = "";
        
        for(int i = 0; i < animals.size(); i++) {
            toDisp += animals.get(i).getName() + " ";
            toDisp += animals.get(i).getSpecies() + " ";
            toDisp += animals.get(i).getAge() + " \n";
        }
        JOptionPane.showMessageDialog(null, toDisp);
    }
}
