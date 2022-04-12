package MissT;

import java.io.*;
import java.util.*;

public class ReadFile {
    public static void main(String[] args){
        try{
            File myObj = new File("us_open_2000");
            Scanner scanner = new Scanner(myObj);
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        }catch(FileNotFoundException e){
            System.out.println(("An Error occurred!!"));
            e.printStackTrace();
        }
    }
}