package databaseproject;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class DatabaseProject {
    
    static ArrayList animals = new ArrayList<Animal>();

    public static void readInList() throws Exception {
        
        String homePath = System.getProperty("user.home"); 
        String filename = homePath + "/NetBeansProjects/databaseProject/src/databaseproject/ListOfCharacters";
        Scanner file = new Scanner(new File(filename));
        while(file.hasNextLine()){
            String line = file.nextLine();
            String splitline[] = line.split("\\s*,\\s*"); //used a regex, good for any case involving a coma and any amount of spaces
            String name = splitline[0];
            String species = splitline[1];
            int age = Integer.parseInt(splitline[2]);
            int weight = Integer.parseInt(splitline[3]);
            int height = Integer.parseInt(splitline[4]);
            Animal temp = new Animal(name, species, age, weight, height);
            System.out.println(temp);
            animals.add(temp);
        }
        System.out.println("Done reading in file");
    }
    
    public static void mainMenu() throws Exception {
        String choice = "";
        while(!choice.equals("X")){
            String menu = "Main Menu \n"
                    + "A: Read in Data \n"
                    + "B: Display Menu \n"
                    + "C: Search Menu \n"
                    + "X: Exit";
            choice = JOptionPane.showInputDialog(menu);
            if(choice.equals("A"))
                readInList();
            if(choice.equals("B"))
                displayMenu();
            if(choice.equals("C"))
                searchMenu();
        }
    }
    
    public static void displayMenu() throws Exception {
        String choice = "";
            String menu = "Display Menu \n"
                    + "A: Display 1 \n"
                    + "B: Display 2 \n"
                    + "C: Display 3 \n"
                    + "X: Exit";
            choice = JOptionPane.showInputDialog(menu);
            if(choice.equals("A"))
                System.out.println("Display 1");
            if(choice.equals("B"))
                System.out.println("Display 2");
            if(choice.equals("C"))
                System.out.println("Display 3");
    }
    
    public static void searchMenu() throws Exception {
        String choice = "";
            String menu = "Search Menu \n"
                    + "A: Display 1 \n"
                    + "B: Display 2 \n"
                    + "C: Display 3 \n"
                    + "X: Exit";
            choice = JOptionPane.showInputDialog(menu);
            if(choice.equals("A"))
                System.out.println("Search 1");
            if(choice.equals("B"))
                System.out.println("Search 2");
            if(choice.equals("C"))
                System.out.println("Search 3");
    }
    
    public static void main(String[] args) throws Exception {
//        readInList();
        mainMenu();
    }
    
}