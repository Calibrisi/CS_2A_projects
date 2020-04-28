package databaseproject;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DatabaseProject {
    
    static ArrayList animals = new ArrayList<Animal>();

    public static void readInList() throws Exception {
        
        String homePath = System.getProperty("user.home"); 
        String filename = homePath + "/NetBeansProjects/databaseProject/src/databaseproject/ListOfCharacters";
        Scanner file = new Scanner(new File(filename));
        while(file.hasNextLine()){
            String line = file.nextLine();
            String splitline[] = line.split("\\s*,\\s*");
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
    
    public static void main(String[] args) throws Exception {
        readInList();
    }
    
}