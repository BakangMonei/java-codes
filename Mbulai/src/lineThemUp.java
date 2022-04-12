import java.util.Scanner;
import java.io.*; // library to call buffered reader, IOException, InputStreamReader

public class lineThemUp {
    public static void main(String[] args) {
        int count;
        String temp;
        Scanner scan = new Scanner(System.in);

        // User will be asked to enter the count of Strings
        System.out.println("Enter number of Strings you would like to enter: ");
        count = scan.nextInt();

        String str[] = new String[count];
        Scanner scan2 = new Scanner(System.in);

        // User will enter the Strings and they are sorted into array
        System.out.println("Enter the Strings one by one: ");
        for (int i = 0; i < count; i++) {
            str[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();

        // Sorting the Strings
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++){
                if (str[i].compareTo(str[j])>0){
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        // Displaying the Strings after sorting them alphabetically
        System.out.println("Strings in sorted order: ");
        for (int i = 0; i <= count - 1; i++){
            System.out.print(str[i] + ", ");
        }
    }
}
