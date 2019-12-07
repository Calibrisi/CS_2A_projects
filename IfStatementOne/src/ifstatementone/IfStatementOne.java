package ifstatementone;

import java.util.Scanner;

public class IfStatementOne {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int mon = input.nextInt();
        input.nextLine();
        
        if (mon == 1){
            System.out.println("The month associated with this number is January");}
        if (mon == 2){
            System.out.println("The month associated with this number is Febuary");}
        if (mon == 3){
            System.out.println("The month associated with this number is March");}
        if (mon == 4){
            System.out.println("The month associated with this number is April");}
        if (mon == 5){
            System.out.println("The month associated with this number is May");}
        if (mon == 6){
            System.out.println("The month associated with this number is June");}
        if (mon == 7){
            System.out.println("The month associated with this number is July");}
        if (mon == 8){
            System.out.println("The month associated with this number is August");}
        if (mon == 9){
            System.out.println("The month associated with this number is September");}
        if (mon == 10){
            System.out.println("The month associated with this number is October");}
        if (mon == 11){
            System.out.println("The month associated with this number is November");}
        if (mon == 12){
            System.out.println("The month associated with this number is December");}
        
        
        
        System.out.println("Enter a month");
        String month = input.nextLine();
        
        month = month.toUpperCase();
        
        if (month.contains("JAN")){
            System.out.println("The number associated with this month is 1");}
        if (month.contains("FEB")){
            System.out.println("The number associated with this month is 2");}   
        if (month.contains("MAR")){
            System.out.println("The number associated with this month is 3");}
        if (month.contains("APR")){
            System.out.println("The number associated with this month is 4");}    
        if (month.contains("MAY")){
            System.out.println("The number associated with this month is 5");}
        if (month.contains("JUNE")){
            System.out.println("The number associated with this month is 6");}    
        if (month.contains("JULY")){
            System.out.println("The number associated with this month is 7");}    
        if (month.contains("AUG")){
            System.out.println("The number associated with this month is 8");}
        if (month.contains("SEP")){
            System.out.println("The number associated with this month is 9");}    
        if (month.contains("OCT")){
            System.out.println("The number associated with this month is 10");}    
        if (month.contains("NOV")){
            System.out.println("The number associated with this month is 11");}    
        if (month.contains("DEC")){
            System.out.println("The number associated with this month is 12");}
           
            
        System.out.println("Enter a letter");
        String letter = input.nextLine();
        
        letter = letter.toUpperCase();
        
        if (letter.contains("A") || letter.contains("E") || letter.contains("I") || letter.contains("O") || letter.contains("U")){
            System.out.println("The letter is a vowel");
        }
        else{
            System.out.println("The letter is a consonent");
        }
        
        
        System.out.println("Enter a letter");
        String let2 = input.nextLine();
        
        String cs = "COMPUTER SCIENCE";
        let2 = let2.toUpperCase();
        if (cs.contains(let2)){
            System.out.println("The letter is contained in the words Computer Science");}
        else {
            System.out.println("The letter is not contained in the words Computer Science");
        }
        
        
    }
    
}   