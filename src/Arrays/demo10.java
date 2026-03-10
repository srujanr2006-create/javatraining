package Arrays;

public class demo10 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 7, 1, 6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
            if (arr[i] % 2 == 0) {
                if (arr[j] % 2 != 0) {
                    System.out.print(arr[j]);
                System.out.print(arr[i]);
            }


                }
            }
        }
    }
}
