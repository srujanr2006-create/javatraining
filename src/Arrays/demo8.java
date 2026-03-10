package Arrays;

public class demo8 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == 9){
                    System.out.println("pair is found: " +arr[i] + " " +arr[j]);
                    System.out.println("indexes are: " + i + " " + j);
                }

            }
        }
    }
}
