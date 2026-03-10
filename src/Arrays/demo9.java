package Arrays;

public class demo9 {
    public static void main(String[] args) {
        int[] arr = {2,2,1,2,3,2,2};
        for (int i=0; i<arr.length; i++){
            int count = 0;
            int n = arr.length;
            for(int j=0; j<arr.length; j++ ) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }if(count>n/2){
                System.out.println("frequent number is: "+ arr[i]  );
            }else{
                System.out.println("no majority elements found ");
            }
        }

    }
}
