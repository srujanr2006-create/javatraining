package recursion;

public class rec2 {
    static int sum(int x){
        if(x==1) {
            return 1;
        }else{
            return x + sum(x-1);
        }
    }

    public static void main(String[] args) {
        int num = 100;
        int result =  sum(num);
        System.out.println(result);
    }

}


