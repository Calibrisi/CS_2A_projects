package mathproblems;

import java.util.Scanner;

public class MathProblems {

    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = input.nextInt();
        System.out.println(num1 + " times 10 is " + num1 * 10);
        System.out.println("Enter another number");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sumation is " + sum);
        int max = Math.max(num1, num2);
        System.out.println("The largest number is " + max);
        int product = num1 *  num2;
        System.out.println("The product is " +product);
        int dif = num1 -  num2;
        System.out.println("The difference is " +dif);
        int max2 = Math.max(sum, product);
        System.out.println("The largest number that is either the sum or product is " +max2);
        int quo = num1 /  num2;
        System.out.println("The quotient is " +quo);
        int rem = num1 %  num2;
        System.out.println("The remainder is " +rem);
        double pow= Math.pow(num1, num2);
        System.out.println(num1 + " to the power of " + num2 + " is " + pow);
        System.out.println("Enter another number");
        int num3 = input.nextInt();
        int product2 = num1 *  num2 * num3;
        System.out.println("The product is " +product2);

      }

    }
