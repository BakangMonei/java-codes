package takehome2;

import java.util.Scanner;

public class Guzzler {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int petrolAmount = 0;

        System.out.println("*******************************************************************************");
        System.out.println("Price: P9.56/L");
        System.out.print("Tank size: ");
        petrolAmount = scanner.nextInt();

        double cost = petrolAmount * 9.56;
        System.out.println("Total Cost: P" + String.format("%.2f", cost)); // placing to 2 decimal place

        if (cost <= 199.90){
            System.out.println("Msg: I need a car like yours!");
        }
        else if (cost <= 299.99){
            System.out.println("Msg: That's reasonable!");
        }
        else if (cost <= 399.99){
            System.out.println("Msg: I need to change jobs!");
        }
        else if (cost <= 499.99){
            System.out.println("Msg: Can't compete with you!");
        }
        else if (cost >= 500.00){
            System.out.println("Is that a v8 or a v12?");
        }
        System.out.println("*******************************************************************************");
    }
}
