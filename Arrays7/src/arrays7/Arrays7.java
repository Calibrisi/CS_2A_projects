package arrays7;

public class Arrays7 {

    
    public static int countOdds(int[] nums)
    {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            
            if(nums[i]%2 != 0){
                count = count + 1;
            }
        }
        return count;
    }
    
    public static int countEvens(int[] nums)
    {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            
            if(nums[i]%2 == 0){
                count = count + 1;
            }
        }
        return count;
    }
    
    public static int[] returnOdds(int[] nums)
    {
        int toRet[] = new int[nums.length - countEvens(nums)];
        
        int toRetIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 != 0) {
                toRet[toRetIndex] = nums[i];
                toRetIndex++;
            }
        }
        return toRet;
    }
    
    
    public static int[] returnEvens(int[] nums)
    {
        int toRet[] = new int[nums.length - countOdds(nums)];
        
        int toRetIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 == 0) {
                toRet[toRetIndex] = nums[i];
                toRetIndex++;
            }
        }
        return toRet;
    }
    
    public static void printArray(int nums[])
    {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    
    public static void main(String[] args) {
        
//        Instantiate an array and load it with values. 
//        Write methods to determine how many of the values in the array are odd. 
//        Write a methods that returns an array that only contain the odds integers
//        Write a method that returns an array that only contains the even integers.
        
        int nums[] = {3,5,7,7,5,3,13,4,5,7,8,9,11,13,15,7,8,9};
        System.out.println("Number of odd numbers: " + countOdds(nums));
        System.out.println("Odds:");
        printArray(returnOdds(nums));
        System.out.println("Evens:");
        printArray(returnEvens(nums));
    }
    
}