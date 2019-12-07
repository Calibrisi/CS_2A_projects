package romannums;

import java.util.Scanner;

public class RomanNums {

    public static void main(String[] args) {
        
        int ints[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        String roman[] = {"M","CM","D","CD","C","XC", "L","XL","X","IX","V","IV","I"};

        Scanner keyb = new Scanner(System.in);
        System.out.println("Enter number to conver");
        int numb = keyb.nextInt();
        String rom = "";
        
        for(int i = 0 ; i < ints.length ; i++)
        {
            while(numb >= ints[i])
            {
                rom = rom + roman[i];
                numb = numb - ints[i];
            }
        }
        
        System.out.println(rom);

    }
    
}