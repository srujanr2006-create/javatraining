package ExceptionHandling;

public class e3 {
    static void checkAge(int age){
        if(age>=18){
            System.out.println("Access Granted");
        }else {
            throw new RuntimeException("access denaied");
        }

        }

    public static void main(String[] args) {
        checkAge(12);
    }
    }

