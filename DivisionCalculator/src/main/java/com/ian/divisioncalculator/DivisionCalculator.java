package com.ian.divisioncalculator;


/*
    Description:
    Create a program that takes two numbers as input and performs division. 
    Use exception handling to manage scenarios like division by zero or invalid input.
*/


import java.util.Scanner;



public class DivisionCalculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        try{
            
            System.out.print("Enter a numerator: ");
            String numerator = scanner.nextLine();
            
            System.out.print("Enter a denominator: ");
            String denominator = scanner.nextLine();
            
            //convert string to integers
            int num1 = Integer.parseInt(numerator);
            int num2 = Integer.parseInt(denominator);
            
            int result = num1 / num2;
            
            System.out.println("Result: " + result); 
            
        } catch(ArithmeticException e) {
            
            System.out.println("Error cannot divide by zero");
                    
        } catch(NumberFormatException e) {
            
            System.out.println("Error invalid input");
            
        } finally {
            
            //this block executes no matter what happens
            System.out.println("Thank you for using my simple program");
            
        }
    }
}
