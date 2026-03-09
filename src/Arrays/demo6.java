package Arrays;

public class demo6 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum = sum + arr[i];

        }
        int result = 15 - sum;
        System.out.println("missing no is: " + result);
        }
    }

