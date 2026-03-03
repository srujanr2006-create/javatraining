package conditionalstatement;

import java.util.Scanner;

public class studentgradeingsystem {
    public static void main(String[] args) {
        int sub1,sub2,sub3,sub4,sub5;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sub1 marks");
        sub1 = sc.nextInt();
        System.out.println("enter the sub2 marks");
        sub2 = sc.nextInt();
        System.out.println("enter the sub3 marks");
        sub3 = sc.nextInt();
        System.out.println("enter the sub4 marks");
        sub4 = sc.nextInt();
        System.out.println("enter the sub5 marks");
        sub5 = sc.nextInt();
        long sum = sub1+sub2+sub3+sub4+sub5;
        double result = (sum/500)*100;
        System.out.println(result+"%");
        if(result>=75) {
            System.out.println("Grade 'A'");
        }else if(result>=50) {
            System.out.println("Grade 'B'");
        }else if(result>35) {
            System.out.println("Grade 'c'");
        }else{
            System.out.println("god bles you");
        }
    }
}


