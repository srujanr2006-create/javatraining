package inheritance.home;

public class home {
    void hall(){
        System.out.println("smart fan");
    }
}
class kitchen extends home{
    void kitchen(){
        System.out.println("smark light");
    }
}
class bedroom extends kitchen{
    void bedroom(){
        System.out.println("smart window");
    }
}
class driver{
    public static void main(String[] args) {
        kitchen m = new kitchen();
        m.hall();

        bedroom b = new bedroom();
        b.kitchen();
    }
}
