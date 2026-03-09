package Arrays;

public class demo7 {
    public static void main(String[] args) {

    int[] arr = {1, 2, 4, 5};
    int n = 5;   // total numbers should be from 1 to 5

    int expectedSum = n * (n + 1) / 2;  // sum of 1..n
    int actualSum = 0;

            for (int i = 0; i < arr.length; i++) {
        actualSum += arr[i];
    }

    int missing = expectedSum - actualSum;

            System.out.println("Missing element: " + missing);
}
    }

