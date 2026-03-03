package conditionalstatement;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check");
        int n= sc.nextInt();
        if(n%2==0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
