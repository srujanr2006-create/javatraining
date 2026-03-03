package conditionalstatement;

public class pattern5 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" * ");
            }
            System.out.println("  ");
        }
        for (int i = 10 - 1; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" * ");
            }
            System.out.println("  ");
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" * ");
            }
            System.out.println("  ");
        }
        for (int i = 10 - 1; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" * ");
            }
            System.out.println("  ");
        }
    }
}
