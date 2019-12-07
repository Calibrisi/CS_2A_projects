package biggestnumber;
import static java.lang.System.in;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class BiggestNumber {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(in);
        System.out.println("Enter three numbers");

        int[] nums = new int[3];
        nums[0] = input.nextInt();
        nums[1] = input.nextInt();
        nums[2] = input.nextInt();
        
        //sort orders them by increasing value
        Arrays.sort(nums);
        System.out.println("The numbers were " + nums[0] + ", " + nums[1] + " and " + nums[2]);
        System.out.println(nums[nums.length-1] + " is the biggest number");
        
    }
    
}
