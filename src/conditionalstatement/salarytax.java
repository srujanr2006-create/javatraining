package conditionalstatement;

import java.util.Scanner;

public class salarytax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your salary ammount");
        long salary = sc.nextInt();
        if (salary < 300000) {
            System.out.println("your salary amount is:" + salary);
        }else if (salary > 300000 && salary <= 700000){
            double taxammount = 0.10* salary;
            double netsalary = salary - taxammount;
            System.out.println("tax deducted:" + taxammount);
            System.out.println("your salary ammount is:" + netsalary);
        } else{
            double taxammount = 0.20 * salary;
            double netsalary = salary - taxammount;
            System.out.println("tax deducted" + taxammount);
            System.out.println("your net salary is" + netsalary);
    }
    }
    }

