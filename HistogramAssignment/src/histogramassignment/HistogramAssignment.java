package histogramassignment;

public class HistogramAssignment {

    public static int[] createHisto(int[] nums)
    {
        int histo[] = new int[21];
        
        for (int i = 0; i < nums.length; i++) {
            histo[nums[i]] =  histo[nums[i]] + 1;
        }
        
        return histo;
    }
    
     public static void printArray(int nums[])
    {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + " " + nums[i]);
        }
    }
    public static void main(String[] args) {
        int nums[] = {3,5,7,7,5,3,13,4,5,7,8,9,11,13,15,7,8,9,0,20};
        
        int histo[] = createHisto(nums);
        
        printArray(histo);
    }
    
}