package conditionalstatement;

import java.util.Scanner;

public class positivenegetive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the number to be check");
        int n = sc.nextInt();
        if(n>=0) {
            System.out.println("positive");
        }else{
            System.out.println("negetive");
        }

    }
}
