package chaoxiang;
import java.io.IOException;
import java.util.Scanner;


public class Chaoxiang {

    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()){
            
            double data = input.nextDouble();
            double ans = (data - 32);
            ans = (ans/1.8);
            ans = (ans + 273.16);
            System.out.printf("%.2f", ans);
            System.out.println(" ");
            
        }
        
    }
    
}