package Hangman;

import java.util.Scanner;

public class Main {
    static Scanner kb = new Scanner(System.in);
        static Hangman hangman;
        static TestTwist testtwist;
    public static void main(String[] args){
        char choice = ' ';

        while (choice != '0'){
            System.out.println("\nChoose a Game!!");
            System.out.println("----------------------");
            System.out.println("1. Hangman");
            System.out.println("2. Test Twist");
            System.out.println("0. Exit");
            System.out.println("----------------------");
            System.out.println("Enter your choice");
            choice = kb.next().charAt(0);
            switch (choice){
                case '1':
                    hangman = new Hangman("words.txt", 4);
                    hangman.run();
                    break;
                case '2':
                    //testtwist = new TestTwist("testtwist.txt");
                    //testtwist.run();
                    break;
                case '0':
                    System.out.println("Thank you for playing");
                    break;
                default:
                        System.out.println("Invalid choice");
            }
        }
    }
}
