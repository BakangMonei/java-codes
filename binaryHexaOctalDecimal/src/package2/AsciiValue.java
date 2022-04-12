package package2;

public class AsciiValue {
    public static void main(String[] args){
        char ch = 'a';
        int ascii = ch;
        // casting char into an int
        int castAscii = (int) ch;
        System.out.println("The value of " + ch + " is: " + ascii);
        System.out.println("The value of " + ch + " is: " + castAscii);
    }
}
