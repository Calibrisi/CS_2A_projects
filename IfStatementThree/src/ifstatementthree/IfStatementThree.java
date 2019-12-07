package ifstatementthree;

import java.util.Scanner;

public class IfStatementThree {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int x = 0;
        x = num % 2;
        
        if (x == 1) {
            System.out.println("The number is odd");}
        else{System.out.println("The number is even");}
        
        
        System.out.println("Enter a number");
        int hundred = input.nextInt();
        
        if (hundred < 100){
            System.out.println("The number is less than one hundred");}
        else{
            if (hundred == 100){
                System.out.println("The number is equal to one hundred");
            }
            else{
                if (hundred > 100){
                    System.out.println("The number is greater than one hundred");}
            }
        }
        
        
        System.out.println("Enter two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        if (num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        }
        if (num1 < num2){
            System.out.println(num1 + " is less than " + num2);
        }
        
        
        
        System.out.println("Enter a number between 1 and 10");
        int y = input.nextInt();
        
        if (y == 1){
            System.out.println("one");}
        if (y == 2){
            System.out.println("two");}
        if (y == 3){
            System.out.println("three");}
        if (y == 4){
            System.out.println("four");}
        if (y == 5){
            System.out.println("five");}
        if (y == 6){
            System.out.println("six");}
        if (y == 7){
            System.out.println("seven");}
        if (y == 8){
            System.out.println("eight");}
        if (y == 9){
            System.out.println("nine");}
        if (y == 10){
            System.out.println("ten");}
        
    }
    
}
