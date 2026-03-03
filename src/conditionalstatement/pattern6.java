package conditionalstatement;

public class pattern6 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 2*i; k <=2*5; k++) {
                System.out.print(" ");
            }
            for (int j= 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 2*i; k <=2*5; k++) {
                System.out.print(" ");
            }
            for (int j= 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
        }
