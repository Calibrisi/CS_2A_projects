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
    
    public static void AgeWeightHeight(ArrayList<Animal> animals){
        String toDisp = "";
        
        for(int i = 0; i < animals.size(); i++) {
            toDisp += animals.get(i).getAge() + " ";
            toDisp += animals.get(i).getWeight() + " ";
            toDisp += animals.get(i).getHeight() + " \n";
        }
        JOptionPane.showMessageDialog(null, toDisp);
    }
    
    public static void NameSpeciesWeight(ArrayList<Animal> animals){
        String toDisp = "";
        
        for(int i = 0; i < animals.size(); i++) {
            toDisp += animals.get(i).getName() + " ";
            toDisp += animals.get(i).getSpecies() + " ";
            toDisp += animals.get(i).getWeight() + " \n";
        }
        JOptionPane.showMessageDialog(null, toDisp);
    }
}
