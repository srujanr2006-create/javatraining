package ExceptionHandling;

public class e1 {
    public static void main(String[] args) {
        int i = 0, j = 10, k = 0;
        try {
            k = i / j;
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[20]);
        }
        catch(ArithmeticException a){
            System.out.println("error");
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("get lost");
        }
        catch(Exception a){
            System.out.println("unknown exception");
        }
        finally {
            System.out.println("this block will get exception");
        }

        System.out.println("hallo man");
    }
}