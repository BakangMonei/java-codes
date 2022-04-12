package MissT;

import java.util.Scanner;

public class EverySecond {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t <= 100 && t >= 1){
            for (int i = 0; i < t; i++){
                calculate();
            }
        }
    }

    private static void calculate() {
        Scanner sc = new Scanner(System.in);
        String rawString = sc.nextLine();
        StringBuilder afterAdd = new StringBuilder();
        StringBuilder finishChars = new StringBuilder();
        int numberOfChars = rawString.length();
        if (numberOfChars <= 100 && numberOfChars >= 1){
            if (numberOfChars % 2 == 0){
                int numHalfChars = numberOfChars / 2;
                for (int i = 0; i < numHalfChars; i++){
                    afterAdd.append(rawString.charAt(i));
                }
                if(afterAdd.length() <= 2){
                    System.out.println(afterAdd.charAt(0));
                }else{
                    for (int i = 0; i < afterAdd.length(); i = i + 2){
                        finishChars.append(afterAdd.charAt(i));
                    }
                    System.out.println(finishChars);
                }
            }
        }//
    }
}