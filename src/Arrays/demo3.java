package Arrays;

public class demo3 {
    public static void main(String[] args) {
        int[] arr = {3,4,19,25,23};
        int max = 0;
        int min = 100;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
