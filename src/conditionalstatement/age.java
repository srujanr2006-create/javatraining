package conditionalstatement;

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        if(age>17) {
            System.out.println("the person is eligible to vote");
        }else{
            System.out.println("the person is not eligible to vote");
        }
    }
}
