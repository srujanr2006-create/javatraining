package oops.abstraction.partial.abstractclassconstructor;

public interface complete {
    void eat();
    void run();
}
class Dog1 implements complete{
    public void eat(){
        System.out.println("eating..");
    }
    public void run(){
        System.out.println("running..");
    }
}class driver1{
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.eat();
    }
}