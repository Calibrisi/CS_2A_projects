package databaseproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ChangeClass {
    public static void Change(ArrayList<Animal> individuals){
        String name = JOptionPane.showInputDialog("Enter an animal's name");
        for (int i = 0; i < individuals.size(); i++) {
            if(individuals.get(i).getName().toLowerCase().contains(name.toLowerCase())){
                
                String toDisp = "Name: " + individuals.get(i).getName() + " \n";
                toDisp += "Species: " + individuals.get(i).getSpecies() + " \n";
                toDisp += "Age: " + individuals.get(i).getAge() + " \n";
                toDisp += "Weight: " + individuals.get(i).getWeight() + " \n";
                toDisp += "Height: " + individuals.get(i).getHeight() + " \n";
                String ans = JOptionPane.showInputDialog(toDisp + "Do you want to change this entry?");
                
                if(ans.toLowerCase().contains("y")){
                    String NewName = JOptionPane.showInputDialog("Enter a name");
                    String species = JOptionPane.showInputDialog("Enter a species");
                    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter an age"));
                    int weight = Integer.parseInt(JOptionPane.showInputDialog("Enter a weight"));
                    int height = Integer.parseInt(JOptionPane.showInputDialog("Enter a height"));
                    
                    individuals.get(i).setName(NewName);
                    individuals.get(i).setSpecies(species);
                    individuals.get(i).setAge(age);
                    individuals.get(i).setWeight(weight);
                    individuals.get(i).setHeight(height);
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Finished with changes");
    }
}
