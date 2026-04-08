package recursion;

public class rec1 {
    public static void main(String[] args) {
        int n=10;
        int sum=0;
        for(int i =0; i<=n; i++ ){
              sum = sum + i;

        }
        System.out.println(sum);

    }
}
//using recursive
 class recursive{
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
