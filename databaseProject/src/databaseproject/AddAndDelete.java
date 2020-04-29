package databaseproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AddAndDelete {
    public static void Delete(ArrayList<Animal> individuals){
        String name = JOptionPane.showInputDialog("Enter the name of an entry to delete");
        for (int i = 0; i < individuals.size(); i++) {
            if(individuals.get(i).getName().toLowerCase().contains(name.toLowerCase())){
                
                String toDisp = "Name: " + individuals.get(i).getName() + " \n";
                toDisp += "Species: " + individuals.get(i).getSpecies() + " \n";
                toDisp += "Age: " + individuals.get(i).getAge() + " \n";
                toDisp += "Weight: " + individuals.get(i).getWeight() + " \n";
                toDisp += "Height: " + individuals.get(i).getHeight() + " \n";
                String ans = JOptionPane.showInputDialog(toDisp + "Do you want to delete");
                
                if(ans.toLowerCase().contains("y")){
                    individuals.remove(i);
                }
            }
        }
        JOptionPane.showMessageDialog(null, "The selected data entry has been deleted");
    }
    
    public static void Add(ArrayList<Animal> individuals){
        String name = JOptionPane.showInputDialog("Enter a name");
        String species = JOptionPane.showInputDialog("Enter a species");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter an age in years"));
        int weight = Integer.parseInt(JOptionPane.showInputDialog("Enter a weight in pounds"));
        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter a height in feet"));
        Animal temp = new Animal(name, species, age, weight, height);
        individuals.add(temp);
    }
}
