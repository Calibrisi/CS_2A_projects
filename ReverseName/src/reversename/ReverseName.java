package reversename;

import java.util.Scanner;

public class ReverseName {
    public static void main(String args[]) {
        System.out.println("Enter your name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        name = name.toLowerCase();
        
        int len = name.length();
        
        for(int i = 0; i < name.length(); i = i + 1)
        {
            System.out.print(name.substring(len - 1 - i, len - 1 - i + 1));
        }
    }
}