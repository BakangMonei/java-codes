package takehome2;

import java.lang.Math;

import java.util.Scanner;


public class DrunkenMaster
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int stepsTaken = 0;

        System.out.print("DrunkenMaster steps: ");
        stepsTaken = scan.nextInt();

        int x = 0;
        int y = 0;
        int i = 0;


        while (i < stepsTaken) {
            double value = Math.random();
            if (i < stepsTaken) {
                if(value < 0.25) {
                    x = x + 1;
                }

                if(value < 0.5 && value >= 0.25) {
                    y = y - 1;
                }

                if(value < 0.75 && value >= 0.5) {
                    x = x - 1;
                }

                if(value >= 0.75) {
                    y = y + 1;
                }
            }
            i = i + 1;
        }
        double distance = Math.sqrt(Math.pow(x-0,2) + Math.pow(y-0,2));
        System.out.printf("Drunken Master started at: (0, 0) and finished at (%d, %d).\n", x, y);
        System.out.printf("Drunken Master is %.2f units away.\n", distance);
    }
}