package barb;

import java.io.IOException;
import java.util.Scanner;

public class Barb {
    
    public static void main(String[] args) /*throws IOException*/{
        
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        StringBuilder reverse = new StringBuilder(word);
        reverse.reverse();
        
        System.out.print(word + " ");
        System.out.print(reverse.toString().toUpperCase() + " ");
        System.out.print(reverse.toString().substring(word.length()/2, word.length()) + " ");
        System.out.print(word.toUpperCase().substring(word.length()/2, word.length()) + " ");
        System.out.println(" ");
        
    }
    
}