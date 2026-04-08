package recursion;
import java.util.ArrayList;
import java.util.List;

public class rec5 {
    static void ArraySubset(int[] arr, int index, List<Integer> current){
        if(index == arr.length){
            System.out.println(current);
            return;
        }
        current.add(arr[index]);
        ArraySubset(arr,index+1,current);
        current.remove(current.size()-1);
        ArraySubset(arr,index+1,current);
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        int index=0;
        ArraySubset(arr,index,new ArrayList<>());
    }
}