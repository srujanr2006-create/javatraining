package inheritance;

public class multipleinherit {
    void eat(){
        System.out.println("eating...");
    }
}
class dog extends multipleinherit{
    void bark(){
        System.out.println("barking...");
    }
}
class puppy extends dog{
    void cry(){
        System.out.println("crying..");
    }
}
class driver{
    public static void main(String[] args) {
        dog u = new dog();
        u.bark();

        puppy n = new puppy();
        n.cry();

    }

}
