package ExceptionHandling;
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.util.Scanner;
    import java.io.InputStreamReader;

    public class e4 {
        public static void main(String[] args) throws IOException {
            String name;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter some name!: ");
            name = br.readLine();
            System.out.println("you entered:  " + name);
        }
    }
