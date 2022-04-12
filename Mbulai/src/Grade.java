import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        int score; // To hold test score
        char grade; // To hold letter grade

        // Create a scanner object to read input
        Scanner console = new Scanner(System.in);

        // Getting the test score
        System.out.print("Numeric Score: ");
        score = console.nextInt();

        // Calculate the grade
        if(score >= 93){
            grade = 'A';
        }
        else if(score >= 84){
            grade = 'B';
        }
        else if(score >= 75){
            grade = 'C';
        }
        else if(score >= 50){
            grade = 'D';
        }
        else{
            grade = 'F';
        }

        // Displaying the grade
        System.out.println("Letter Grade: " + grade);
    }
}