import java.util.Scanner;

public class initials {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String first = in.next();
        System.out.println("Enter your surname: ");
        String second = in.next();

        String initials = first.substring(0, 1) + "&" + second.substring(0,1);
        System.out.println(initials);
    }
}
