package polymorphism;

public class addtion {
    int add(int a, int b){
        return a+b;
    }

    int add(int a , int b , int c){
        return a+b+c;
    }
}
 class Driver{
     public static void main(String[] args) {
         addtion obj = new addtion();
         System.out.println(obj.add(1,4));
         System.out.println(obj.add(3,6,8));
     }
 }
