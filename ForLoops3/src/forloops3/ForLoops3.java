package forloops3;
import static java.lang.System.*;
import java.util.*;

public class ForLoops3 {
    
    public static void Loop3(int num)
    {
       for(int i = 0 ; i < num ; i++){
           for(int j = 0 ; j < num ; j++){
                if(i == 0 || j == 0 || i == num - 1 || j == num - 1){
                    System.out.print("X");
                }
                else{
                    System.out.print("O");
                }
           }
           System.out.println("");
        }
    }
    
    
    public static void Loop10(int num)
    {
       for(int i = 0 ; i < num ; i++){
           for(int j = 0 ; j < num ; j++){
                if(i == 0 || j == 0 || i == num - 1 || j == num - 1){
                    System.out.print("X");
                }
                else{
                    System.out.print(" ");
                }
           }
           System.out.println("");
        }
    }
    
    
    public static void Loop11(int num)
    {
       for(int i = 0 ; i < num ; i++){
           for(int j = 0 ; j < i ; j++){
                if(i == 0 || j == 0 || i == num - 1 || j == i - 1){
                    System.out.print("X");
                }
                else{
                    System.out.print("O");
                }
           }
           System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Scanner keyb = new Scanner(in);
        System.out.println("Enter a number");
        int num = keyb.nextInt();
        Loop11(num);
        
        
        
    }
    
}
