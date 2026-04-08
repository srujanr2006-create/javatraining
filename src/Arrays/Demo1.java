package Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,4,5,2,1};
        System.out.println(arr1[1]);
        //System.out.println(arr1);

        for (int i=0; i<arr1.length; i++ ){
            System.out.print(arr1[i]+ " " );
        }
        for (int i=0; i<arr2.length; i++){
            System.out.print( " "+  arr2[i]);
        }

    }
}
