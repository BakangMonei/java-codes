package takehome2;



import java.util.Scanner;

public class CreditCardCheck {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long evenSumOfNumber = 0;
        long oddSumOfNumber = 0;
        long totalSum = 0;
        boolean isValid = true;
        String valid = "";

        System.out.println("Credit CardNumber: ");
        long card = scan.nextLong();
        evenSumOfNumber = sumOfDoubleEvenPlace(card);
        oddSumOfNumber = sumOfOddPlace(card);


        totalSum = evenSumOfNumber + oddSumOfNumber;
        isValid = cardValid(totalSum);

        //If statement to assign valid or invalue to boolean.
        if (isValid == true) {
            valid = "valid";
        } else {
            valid = "not valid";
        }
        //Final decision printed.
        System.out.println(card + " is " + valid);
    }

    public static long sumOfDoubleEvenPlace(long num) {
        int sum = 0;
        long temp = 0;

        while (num > 0) {
            num /= 10;
            long num1 = (num % 10) * 2;
            if (num1 >= 10) {
                temp = num1;
                num1 /= 10;
                temp %= 10;
                sum += (temp + num1);
            } else if (num1 < 10) {
                sum += num1;
            }
            num /= 10;
        }
        return sum;
    }

    public static long sumOfOddPlace(long num) {
        int sum = 0;

        while (num > 0) {
            long num1 = num % 10;
            sum += num1;
            num /= 100;
        }
        return sum;
    }

    public static boolean cardValid(long sum) {
        boolean d = true;
        if (sum % 10 == 0) {
            d = true;
        } else {
            d = false;
        }
        return d;
    }
}