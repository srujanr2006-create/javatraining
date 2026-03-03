package abstaction.partial;

abstract class Animal {
    abstract void eat();
    void run(){
        System.out.println("running..");
    }
}

class lion extends Animal{
        void eat(){
            System.out.println("meat");

        }
}

class dear extends lion{
    void eat(){
        System.out.println("non veg");

    }
}
class drive{
    public static void main(String[] args) {
        lion l = new lion();
        dear d = new dear();
        l.eat();
        d.run();
    }
}