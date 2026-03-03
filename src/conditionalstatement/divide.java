package conditionalstatement;

import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to be check");
        int n = sc.nextInt();
        if(n%3==0 && n%4==0){
            System.out.println("the number is divisable by both 3 and 7");
        }else{
            System.out.println("get out");
        }


    }
}
