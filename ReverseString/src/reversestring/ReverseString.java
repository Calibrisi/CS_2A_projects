package reversestring;
import java.util.Scanner;


public class ReverseString {

    public static String reverseWord(String original){
        String newString = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            newString = newString + original.charAt(i);
        }
        return newString;
    }
    
    public static boolean isPalindrome(String original){
        if(original.equals(reverseWord(original))){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();
        
        System.out.println("The word was " + word);
        
        String reverse = reverseWord(word);
        System.out.println("The word backward is " + reverse);
         
        if(isPalindrome(word)){
            System.out.println("The word is a palindrome");
        }
        else{
            System.out.println("The word is not a palindrome");
        }
        
        }
        
    }