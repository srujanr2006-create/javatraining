package FIleHandling;

import java.io.FileWriter;
import java.io.IOException;

public class writefileWexample {
    public static void main(String[] args) {
        try{
            //to create writer obj and creat a file
            FileWriter writer = new FileWriter("student.txt");

            //step 2 writing the data into file
            writer.write("hello students \n wellcome to class");

            //closing the writer obj to close thr resourse
            writer.close();

            System.out.println("file written successfuly");
        }catch (IOException e){
            System.out.println("error occured");
        }
    }
}
