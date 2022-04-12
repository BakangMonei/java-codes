package MissT;

import java.util.Scanner;

public class PaymasterII {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String firstName, lastName, employeeCode;
        int hoursWorked;
        double pay, hourlyRate;


        System.out.print("firstName: ");
        firstName = in.nextLine();

        System.out.print("lastName: ");
        lastName = in.nextLine();

        System.out.print("employee Code: ");
        employeeCode = in.nextLine();

        System.out.print("hourlyRate: ");
        hourlyRate = in.nextDouble();

        System.out.print("hoursWorked: ");
        hoursWorked = in.nextInt();

        pay = hoursWorked * hourlyRate;

        if (hoursWorked > 20){
            System.out.println("Invalid number of hours");
        }

        System.out.println("Name                       Hours Worked                 Pay");
        System.out.println("===========================================================");
        System.out.println(firstName + " " + "(" + employeeCode + ")" + "          " + hoursWorked + "                      " + pay);
    }
}
