package base.conversion;

import static java.lang.System.in;
import java.util.Scanner;

public class BaseConversion {
    
    
    public static void BinaryToDecimal(){
        
        Scanner scan = new Scanner(in);
        long bin = scan.nextLong();
        long mult = 1;
        long numB10 = 0;
        while (bin > 0){
            long lastnum = bin % 10;
            numB10 = numB10 + lastnum * mult;
            bin = bin / 10;
            mult = mult * 2;
        }
        
        System.out.println(numB10);
        
    }
    
    
    public static void DecimalToBinary(){
        
        Scanner scan = new Scanner(in);
        int numB10 = scan.nextInt();
        
        String Binary = "";
        while(numB10 > 0){
            
            if(numB10 % 2 == 0){
                Binary = "0" + Binary;
            }
            else{
                Binary = "1" + Binary;
            }
            numB10 = numB10 / 2;
        }
        
        System.out.println(Binary);
        
    }

    
    public static void main(String[] args) {
        
        //BinaryToDecimal();
        DecimalToBinary();
        
    }
    
}