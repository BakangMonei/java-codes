package package1;
/*
author: Monei Bakang
title: Java program to convert Decimal to [Binary, Hexadecimal & Octal] numbers
*/

import java.util.*;
public class Convert {
Scanner scan;
int num;
void getVal(){
    System.out.println("Decimal to Hexadecimal, Binary & Octal");
    scan = new Scanner(System.in);
    System.out.print("Enter number of your choice: ");
    num = Integer.parseInt(scan.nextLine());
}/*********************************************************************************************/


void convert(){
    // Hexadecimal
    String hexa = Integer.toHexString(num);
    System.out.println("Hexadecimal Number is: " + hexa);
    // Octal
    String octal = Integer.toOctalString(num);
    System.out.println("Octal Number is: " + octal);
    // Binary
    String binary = Integer.toBinaryString(num);
    System.out.println("Binary Number is: " + binary);
}/*********************************************************************************************/
}

class Decimal_Conversion{
    public static void main(String[] args){
        Convert obj = new Convert();
        obj.getVal();
        obj.convert();
    }
}