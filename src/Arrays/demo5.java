package Arrays;

public class demo5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] prefix = new int[arr1.length];
        prefix[0] = arr1[0];

        for (int i = 1; i < arr1.length; i++) {
            prefix[i] = prefix[i - 1] + arr1[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(prefix[i] + " ");
        }
            // --------------------------------------------------------------------------------------------------
            // prefix range with sum
            int l = 1;
            int r = 3;

            int sum;
            if (l == 0) {
                sum = prefix[r];
            } else {
                sum = prefix[r] - prefix[l - 1];
            }
            System.out.println("sum of range from index 1 to 3 is: " + sum);
        }

    }

