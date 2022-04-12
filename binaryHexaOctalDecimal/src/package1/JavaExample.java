package package1;

import java.util.*;

// Creating a class
public class JavaExample {
    // Creating the main method
    public static void main(String[] args){
        /*
        * Program that allows student to do 6 subjects
        * Using Array methods
        * */

        // Declaring the variables
        int marks[] = new int[6];
        int i;
        float total = 0, avg;
        Scanner scanner = new Scanner(System.in); // Creating and declaring a input scanner

        /////////////////////////////////////////////////////
        // Loops
        for (i = 0; i < 6; i++){
            System.out.println("Enter the marks of Subject: " + (i + 1) + ":"); // Increment since its an array list
            marks[i] = scanner.nextInt(); // This method forces system to allow numbers only
            total = total + marks[i];
        }
        scanner.close(); // Method closes if anything not a number is entered

        // Calculating average
        avg = total / 6;
        System.out.println("The student grade is: ");
        if(avg >= 80){
            System.out.println("A");
        }
        else if(avg >= 60 && avg < 80){
            System.out.println("B");
        }
        else if(avg >= 40 && avg < 60){
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }
        System.out.println("Average is: "+ avg);
    }
}