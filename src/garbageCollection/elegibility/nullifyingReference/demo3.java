package garbageCollection.elegibility.nullifyingReference;

public class demo3 {
    public void finalize(){
        System.out.println("garbage collection");
    }
    public static void main(String[] args) {
        for(int i=0; i<10000; i++) {
            demo3 obj = new demo3();
            obj = null;
        }
        System.gc();//call garbage collection
    }
}
