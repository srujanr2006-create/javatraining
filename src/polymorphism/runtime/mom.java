package polymorphism.runtime;

public class mom {
    void cook(){
        System.out.println("indian");
    }
}
class Daughter extends mom{
    void cook(){
        System.out.println("chinese");
    }
}
class driver{
    public static void main(String[] args) {
        mom m = new mom();
        Daughter d = new Daughter();
        m.cook();
        d.cook();
    }
}