package ExceptionHandling;

import java.util.Scanner;

public class e3example {
    public static void main(String[] args) {
        try {
            int balance = 3000;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the withdraw ammount: ");
            int withdraw = sc.nextInt();
            if (withdraw >= balance) {
                throw new ArithmeticException("  insuficient balance");
            }
            System.out.println("withdraw sucssesfull");
        }catch(ArithmeticException a){
            System.out.println("ecception caught: " + a.getMessage());
        }
    }
}
