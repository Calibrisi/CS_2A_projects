package romannums;

import java.util.Scanner;

public class RomanNums2 {
    
    static public class Mapping
    {
        int number;
        String roman;
        
        Mapping(int numberArg, String romanArg)
        {
            number = numberArg;
            roman = romanArg;
        }
        
        Mapping(final Mapping rhs)
        {
            number = rhs.number;
            roman = rhs.roman;
        }
        
        int getNumber()
        {
            return number;
        }
        
        String getRoman()
        {
            return roman;
        }
    }

    static final Mapping[] lookup = {
        new Mapping(1000, "M"),
        new Mapping(900, "CM"),
        new Mapping(500, "D"),
        new Mapping(400, "CD"),
        new Mapping(100, "C"),
        new Mapping(90, "XC"),
        new Mapping(50, "L"),
        new Mapping(40, "XL"),
        new Mapping(10, "X"),
        new Mapping(9, "IX"),
        new Mapping(5, "V"),
        new Mapping(4, "IV"),
        new Mapping(1, "I")
    };
        
    public static void main(String[] args) 
    {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Enter number to conver");
        int numb = keyb.nextInt();
        String rom = "";
        
        for(int i = 0 ; i < lookup.length ; i++)
        {
            while(numb >= lookup[i].getNumber())
            {
                rom = rom + lookup[i].getRoman();
                numb = numb - lookup[i].getNumber();
            }
        }
        
        System.out.println(rom);

    }
    
}