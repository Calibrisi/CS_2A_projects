package databaseproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SearchClass {
    public static void Name(ArrayList<Animal> individuals){
        String name = JOptionPane.showInputDialog("Enter an animal's name");
        for (int i = 0; i < individuals.size(); i++) {
            if(individuals.get(i).getName().toLowerCase().contains(name.toLowerCase())){
                
                String toDisp = "Name: " + individuals.get(i).getName() + " \n";
                toDisp += "Species: " + individuals.get(i).getSpecies() + " \n";
                toDisp += "Age: " + individuals.get(i).getAge() + " \n";
                toDisp += "Weight: " + individuals.get(i).getWeight() + " \n";
                toDisp += "Height: " + individuals.get(i).getHeight() + " \n";
                JOptionPane.showMessageDialog(null, toDisp);
            }
        }
        JOptionPane.showMessageDialog(null, "Finished with search");
    }
    
    public static void Species(ArrayList<Animal> individuals){
        String species = JOptionPane.showInputDialog("Enter an animal's species");
        for (int i = 0; i < individuals.size(); i++) {
            if(individuals.get(i).getSpecies().toLowerCase().contains(species.toLowerCase())){
                
                String toDisp = "Name: " + individuals.get(i).getName() + " \n";
                toDisp += "Species: " + individuals.get(i).getSpecies() + " \n";
                toDisp += "Age: " + individuals.get(i).getAge() + " \n";
                toDisp += "Weight: " + individuals.get(i).getWeight() + " \n";
                toDisp += "Height: " + individuals.get(i).getHeight() + " \n";
                JOptionPane.showMessageDialog(null, toDisp);
            }
        }
        JOptionPane.showMessageDialog(null, "Finished with search");
    }
    
    public static void Age(ArrayList<Animal> individuals){
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter an minimum age"));
        for (int i = 0; i < individuals.size(); i++) {
            if(individuals.get(i).getAge() >= age){
                
                String toDisp = "Name: " + individuals.get(i).getName() + " \n";
                toDisp += "Species: " + individuals.get(i).getSpecies() + " \n";
                toDisp += "Age: " + individuals.get(i).getAge() + " \n";
                toDisp += "Weight: " + individuals.get(i).getWeight() + " \n";
                toDisp += "Height: " + individuals.get(i).getHeight() + " \n";
                JOptionPane.showMessageDialog(null, toDisp);
            }
        }
        JOptionPane.showMessageDialog(null, "Finished with search");
    }
}
