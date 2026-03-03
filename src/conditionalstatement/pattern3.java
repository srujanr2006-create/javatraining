package conditionalstatement;

public class pattern3 {
    public static void main(String[] args) {
        // int rows = 5;
        for(int k=1; k<=5; k++){
            for(int i=1; i<=5-k; i++){
                System.out.print("   ");
            }
            for(int j=1; j<=(2*k-1); j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
