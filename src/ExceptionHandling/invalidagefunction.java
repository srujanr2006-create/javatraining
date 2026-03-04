package ExceptionHandling;

public class invalidagefunction extends RuntimeException {
    invalidagefunction(String msg){
        super(msg);
    }
}
 
class driver{
    static void checkAge(int age){
        if(age<18) {
            throw new invalidagefunction("age must be over 18 ");
        }
        System.out.println("he is eligible");
        }

    public static void main(String[] args) {
        checkAge(40);
    }
    }
