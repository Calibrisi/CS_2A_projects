package bayani;
import java.io.IOException;
import java.util.Scanner;


public class Bayani {

    
    public static void main(String[] args) throws IOException {
        double sum =0;
        Scanner input = new Scanner(System.in);
        
        for(int x = 0; x < 5; x++){
            
            double num = input.nextDouble();
            sum = sum + num;
            System.out.printf("        $%7.2f", num);
            System.out.println("");
        }
        System.out.printf("Total = $%7.2f", sum);
    }
    
}