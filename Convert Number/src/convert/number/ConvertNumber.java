package convert.number;

import java.util.Scanner;
import java.lang.Math;

public class ConvertNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for the radius");
        double r = input.nextDouble();
        double r2 = r * r;
        
        System.out.println("The radius is " + Math.PI * r2);
        
        
        
        
    }
    
}
