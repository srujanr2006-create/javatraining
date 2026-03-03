package conditionalstatement;

import java.util.Scanner;

public class largestno{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num 1");
        int a = sc.nextInt();
        System.out.println("enter the num 2");
        int b = sc.nextInt();
        System.out.println("enter the num 1");
        int c = sc.nextInt();
        if(a>b && a>c) {
            System.out.println(" a is greater");
        }else if(b>c) {
            System.out.println(" b is greater");
        }else{
            System.out.println(" c is greater");

        }
    }
}

