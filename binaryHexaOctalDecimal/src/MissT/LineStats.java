package MissT;

import java.util.Scanner;
public class LineStats
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //declaration
        int a;//characters
        int b;
        int c;//vowels
        int d;//digits
        int e;//T or t
        String l;
        char z='A';
        char x='a';
        char v='E';
        char n='e';
        char m='I';
        char p='i';
        char o='O';
        char i='o';
        char y='U';
        char t='u';
        char num0='0';
        char num1='1';
        char num2='2';
        char num3='3';
        char num4='4';
        char num5='5';
        char num6='6';
        char num7='7';
        char num8='8';
        char num9='9';
        char t1='T';
        char t2='t';
        //input
        System.out.printf("Enter your line: ");
        l=in.nextLine();
        //process
        a=l.length();
        b=0;
        c=0;
        d=0;
        e=0;
        while(b<a){
            char uv =l.charAt(b);
            if(uv==z || uv==x || uv==v || uv==n || uv==m || uv==p || uv==o || uv==i || uv==y || uv==t )
            {
                c +=1;
            }
            if(uv==num1 || uv==num0 || uv==num2 || uv==num3 || uv==num4 || uv==num5 || uv==num6 || uv==num7 || uv==num8 ||uv==num9){
                d +=1;
            }
            if( uv==t1 || uv==t2){
                e +=1;
            }
            b +=1;
        }
        System.out.printf("Number of Characters    : %d\n",a);
        System.out.printf("Number of vowels        : %d\n",c);
        System.out.printf("Number of digits        : %d\n",d);
        System.out.printf("Number of T or t        : %d\n",e);
    }
}