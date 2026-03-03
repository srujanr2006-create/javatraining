package oops.multipleinheritnce;

interface mom {
    void cook();
}

interface dad{
    void cook();
}

class child implements mom , dad{
    public void cook(){
        System.out.println("south meals");
    }
}
class driver{
    public static void main(String[] args) {
        child d = new child();
        d.cook();

    }
}