package com.ian.studentgradevalidator;


/*
    Description:
    Create a program to manage student grades. 
    The program will validate input and handle errors related to invalid grades or input formats.
*/



import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;



//custom exception for invalid grades 
class InvalidGradeException extends Exception {
    
    public InvalidGradeException(String message) {
        super(message);
    }
}


//custom exception for empty names 
class EmptyNamesException extends Exception {
    
    public EmptyNamesException(String message) {
        super(message);
    }
}


//main
public class StudentGradeValidator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> studentGrades = new HashMap<>();
        
        System.out.println("Student Grade Validator");
        
        while(true) {
            
            try {
                
                String terminator;
                
                //input student name 
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                
                //validate the input
                if(name.isBlank()) {
                    throw new EmptyNamesException("Student name should not be blank!");
                }
                
                
                //input student grade 
                System.out.print("Enter grade for " + name + ": ");
                double grade = scanner.nextDouble();
                scanner.nextLine();
                
                //validate the input
                if(grade < 0.0 || grade > 100.0) {
                    throw new InvalidGradeException("Number should not below 0 and above 100");
                }
                               
                //store the valid data 
                studentGrades.put(name, grade);
                
            } catch(NumberFormatException e) {
                
                System.out.println("Error: Grade must be numeric value");
                
            } catch(InvalidGradeException e) {
                
                System.out.println("Error: " + e.getMessage());
                
            } catch(EmptyNamesException e) {
                
                System.out.println("Error: " + e.getMessage());
                
            }
            
            System.out.print("Enter \"done\" if you are done: " );
            String terminator = scanner.nextLine();
            
            if(terminator.equalsIgnoreCase("done")) {
                break;
            }
        }
        
        // Display valid entries
        System.out.println("\nValid Student Grades:");
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
        
    }
}
