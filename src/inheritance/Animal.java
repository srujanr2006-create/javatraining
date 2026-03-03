package inheritance;

public class Animal {// parent class
    void eat(){
        System.out.println("eating....");
    }
}
class Dog extends Animal{// child class
    void bark(){
        System.out.println("barking....");
    }
}
class Driver{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.bark();

    }
}