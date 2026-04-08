package FIleHandling;

import java.io.File;
import java.util.Scanner;

public class readfileexample {
    public static void main(String[] args) {
        try{
            //step1
            File file = new File("student.txt");

            //step2
            Scanner sc = new Scanner(file);

            //step3
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }

            //step4
            sc.close();
        }catch (Exception e){
            System.out.println("error while reading file!");
        }

    }
}
