package MissT;

import java.util.Scanner;
public class Appointment
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start1,end1,start2,end2;
        int e;
        int s;
        System.out.printf("Enter start1: ");
        start1=in.nextInt();
        System.out.printf("Enter end1: ");
        end1=in.nextInt();
        System.out.printf("Enter start2: ");
        start2=in.nextInt();
        System.out.printf("Enter end2: ");
        end2=in.nextInt();
        
        if(start1>start2){
            s=start1;
        }
        else{
            s=start2;
        }

        //
        if(end1>end2){
            e=end1;
        }
        else{
            e=end2;
        }

        //
        if(s>e){
            System.out.printf("***********************************************************\n");
            System.out.printf("**\n");
            System.out.printf("appointment(%d,%d) overlap with appointment (%d,%d)\n",start1,end1,start2,end2);
            // System.out.println("appointment" + start1 + "," + end1 + " overlap with appointment" + start2 + "," + end2);
            System.out.printf("**\n");
            System.out.printf("***********************************************************\n");
        }
        else{
            System.out.printf("***********************************************************\n");
            System.out.printf("**\n");
            System.out.printf("appointment(%d,%d) do not overlap with appointment (%d,%d)\n",start1,end1,start2,end2);
            System.out.printf("**\n");
            System.out.printf("***********************************************************\n");
        }
    }
}