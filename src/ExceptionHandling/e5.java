package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class e5 {
        public static void main(String[] args) throws IOException {
            String name;
            BufferedReader br = null;
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                name = br.readLine();
            } catch (IOException a ) {

            }
        }
    }