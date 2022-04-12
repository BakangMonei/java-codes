package MissT;

import java.util.*;

public abstract class Grades {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int subA, subB, subC, subD, subE, subF, avg;
        String name, surname, role;

        System.out.print("Name: ");
        name = scanner.nextLine();

        System.out.print("Surname: ");
        surname = scanner.nextLine();

        System.out.print("Mr/Professor/Ms/Mrs/Dr: ");
        role = scanner.nextLine();

        System.out.print("Grade 1: ");
        subA = scanner.nextInt();

        System.out.print("Grade 2: ");
        subB = scanner.nextInt();

        System.out.print("Grade 3: ");
        subC = scanner.nextInt();

        System.out.print("Grade 4: ");
        subD = scanner.nextInt();

        System.out.print("Grade 5: ");
        subE = scanner.nextInt();

        System.out.print("Grade 6: ");
        subF = scanner.nextInt();

        avg = (subA + subB + subC + subD + subE + subF) / 6;
        System.out.println("Your average mark is " + avg + "%" + " " + role + " " + name + " " + surname);

        if(avg > 90){
            System.out.println("A*");
        }
        else if (avg > 80 && avg < 90){
            System.out.println("A");
        }
        else if (avg > 70 && avg < 80){
            System.out.println("B");
        }
        else if (avg > 60 && avg < 70){
            System.out.println("C");
        }
        else if (avg > 50 && avg < 60){
            System.out.println("D");
        }
        else if (avg > 40 && avg < 50){
            System.out.println("E");
        }
        else{
            System.out.println("Discontinue");
        }
    }
}
