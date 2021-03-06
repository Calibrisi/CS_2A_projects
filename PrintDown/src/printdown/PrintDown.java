package printdown;

import static java.lang.System.in;
import java.util.Arrays;
import java.util.Scanner;

public class PrintDown {
    
    public static void one(String s){
        String sent[] = s.split(" ");
        for (int i = 0 ; i < sent.length ; i++){
            System.out.println(sent[i]);
        }
    }
    
    public static void two(String s){
        String sent[] = s.split(" ");
        Arrays.sort(sent);
        for (int i = 0 ; i < sent.length ; i++){
            System.out.println(sent[i]);
        }
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(in);
        System.out.println("Enter a new sentence");
        String sen = input.nextLine();
        
        one(sen);
        System.out.println(" ");
        two(sen);
    }
}