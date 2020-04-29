package databaseproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SortClass {
    public static void Name(ArrayList<Animal> animals){
        for (int i = 0; i < animals.size(); i++) {
            for (int j = 0; j < animals.size()-1; j++) {
                if(animals.get(j).getName().compareTo(animals.get(j+1).getName()) > 0){
                    Animal temp = animals.get(j);
                    animals.set(j, animals.get(j+1));
                    animals.set(j+1, temp);
                }
                
            }
            
        }
        JOptionPane.showMessageDialog(null, "Done with sorting, select display to see results");
    }
    
    public static void Species(ArrayList<Animal> animals){
        for (int i = 0; i < animals.size(); i++) {
            for (int j = 0; j < animals.size()-1; j++) {
                if(animals.get(j).getSpecies().compareTo(animals.get(j+1).getSpecies()) > 0){
                    Animal temp = animals.get(j);
                    animals.set(j, animals.get(j+1));
                    animals.set(j+1, temp);
                }
                
            }
            
        }
        JOptionPane.showMessageDialog(null, "Done with sorting, select display to see results");
    }
    
    public static void Age(ArrayList<Animal> animals){
        for (int i = 0; i < animals.size(); i++) {
            for (int j = 0; j < animals.size()-1; j++) {
                if(animals.get(j).getAge() > animals.get(j+1).getAge()){
                    Animal temp = animals.get(j);
                    animals.set(j, animals.get(j+1));
                    animals.set(j+1, temp);
                }
                
            }
            
        }
        JOptionPane.showMessageDialog(null, "Done with sorting, select display to see results");
    }
}
