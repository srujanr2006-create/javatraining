package SearchingAndSorting;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {10,2,7,1,18,20,11};
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] == 18){
                arr[index] = arr[i];
                index++;
                System.out.println("found: " + arr[i]);
                System.out.println("found in the index: " + i);

            } else{
                System.out.println("there is no number: ");

            }
        }
    }
}
