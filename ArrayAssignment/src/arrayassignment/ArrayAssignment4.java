package arrayassignment;

 class ArrayAssignment4 {

    public static int sumSection(int nums[], int start, int stop)
    {
        int sum = 0;
        // finish method here
        
        for (int i = start; i <= stop; i++) {
            sum = sum + nums[i];
        }
        
        return sum;
    }
    
    public static int countNums(int nums[], int num)
    {
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == num){
                count++;
            }
        }
        return count;
    }
    
    public static int[] removeNum(int nums[], int num)
    {
        int toRet[] = new int[nums.length - countNums(nums,num)];
        
        int toRetIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != num) {
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
        int nums[] = {3,5,7,7,5,3,13,4,5,7,8,9,11,13,15,7,8,9};
        
        System.out.println(sumSection(nums,4,8));
        System.out.println(countNums(nums, 7));
        //7 + 5 + 3 + 13 + 4
        System.out.println("--Print array with out the number 7");
        printArray(removeNum(nums,7));
        // this should print the array without 7
    }
    
}