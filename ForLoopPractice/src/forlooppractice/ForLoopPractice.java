package forlooppractice;
import static java.lang.System.*;
import java.util.*;

public class ForLoopPractice {

    public static void Loop1(int num)
    {
       for(int i = 1 ; i <= num ; i++){
           System.out.println(i);
        
        }
    }
    
    public static void Loop2(int num)
    {
       for(int i = 1 ; i <= 100 ; i++){
           if(i % num != 0){
               System.out.println(i);
           }
        }
    }
    
    public static void Loop3(int num)
    {
       for(int i = 0 ; i < num ; i++){
           for(int j = 0 ; j < num ; j++){
               System.out.print("X");
           }
           System.out.println("");
        }
    }
    
    public static void Loop4(int num)
    {
       for(int i = 0 ; i < num ; i++){
           for(int j = 0 ; j <= i ; j++){
               System.out.print("X");
           }
           System.out.println("");
        }
    }
    
    public static void Loop5(int num)
    {
       for(int i = num ; i > 0 ; i--){
           for(int j = i ; j > 0 ; j--){
               System.out.print("X");
           }
           System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Scanner keyb = new Scanner(in);
        System.out.println("Enter a number");
        int num = keyb.nextInt();
        Loop3(num);
    }
}