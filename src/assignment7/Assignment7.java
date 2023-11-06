package assignment7;
import java.util.Scanner;
/**
 * Integrity Policy Statement My words and actions will reflect Academic
 * Integrity. I will not cheat or lie or steal in academic matters. I will
 * promote integrity in the UNCG community 
 * 
 * Ramon Saturnino
 * 11/06/2023
 *
 */

 //Ramon Saturnino 
 // CSC 130, 
 //Sec 4, 
 //Assignment Seven



public class Assignment7 {
    private static final double COMMISSIONRATE = 0.05;
    ////////Main method (here we are going to invoke the methods we created)
    public static void main(String[] args) {
        System.out.println("Ramon Saturnino");
        System.out.println("CSC 130, Sec 4");
        System.out.println("Assignment Seven\n");
        
        System.out.println("This program uses methods to do tasks.");
        System.out.println("Some of the methods work with strings and other with numbers.\n");
        
        // Here goes all my main method code
        Scanner input = new Scanner(System.in);
        
        System.out.println("I will reverse the word you enter, test if the word is a palindrome.");
        //we call the string method: reverse and check if palindrome
        System.out.print("Please enter a word to check if it's a palindrome: ");
        String palindrome = input.nextLine();
        reverseAndPalindrome(palindrome);

        
        //Here we are going to call the string method: concatString
        System.out.print("\nPlease enter a string: ");
        String userIn = input.nextLine();
        concatString(userIn);
        System.out.println("");
        
        //call number method sum
        int count = 3;
        int sum = sumNumbers(count);
        System.out.println("The sum is: " + sum);
        
        double theAverage = average(count, sum);
        System.out.printf("\nAverage of " + sum + "/" + count + " is %.2f%n", theAverage);
        
        //call number method 3: myCommission
        double salesAmount = 450.00;
        double myCommission = commission(salesAmount);

        System.out.printf("\nThe commission rate of sales amount $%.2f with a commission rate of %.2f%% is $%.2f%n", salesAmount, COMMISSIONRATE, myCommission);
        
        //call to 4th number method: gcd 
        System.out.print("\nEnter the First Number: ");     
        int num1 = input.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2 = input.nextInt();
        int gcd = figureGCD(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        
    }
    
    ////////////////////// String methods
    
    //create a method to check if palindrome
    public static void reverseAndPalindrome(String x){
        String reverseString = "";
        
        for(int i = x.length()-1; i>=0; i--){
            reverseString += x.charAt(i);
        }
        
        System.out.println("Reversed string: " + reverseString);
        
        if(x.compareToIgnoreCase(reverseString)==0){
            System.out.println("The input word is a palindrome");
        }else{
            System.out.println("The input word is not a palindrome");
        }
    }
    
    //second method: concat string
    public static void concatString(String strIn){
        String str = "This is your string: ";
        System.out.println(str + strIn);
    }
    
    /////////////////////// Now, number methods
    
    //first number method: 
    public static int sumNumbers(int count){
        int sum =0;
        for(int i = 1; i<=count; i++){
            System.out.print("Input a whole number: ");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            sum += num;
        }
        return sum;
    }
    
    //second number method: average
    public static double average(int count, int sum){
        return (double) sum /count;
    }
    
    //third number method
    public static double commission(double salesAmount){
        return salesAmount * COMMISSIONRATE;
    }
    
    //fourth number method
    public static int figureGCD(int num1, int num2) {
        while (num2 != 0) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }
    
}
