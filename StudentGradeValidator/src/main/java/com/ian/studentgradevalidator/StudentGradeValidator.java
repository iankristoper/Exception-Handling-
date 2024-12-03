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
        System.out.println("Enter student name and grade. Type 'done' to finish.\n");
        
        
    }
}
