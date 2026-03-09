package threaads.wayofcreatingThreads.threadclass.Synchronization;

class counter{
    static int count = 0;
    synchronized static void increment(){
        count++;
    }
}
class Mythread extends Thread{
    public void run(){
        for(int i=0; i<1000; i++){
            counter.increment();
        }
    }
}
public class syns  {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (Exception a){}

        System.out.println("final count: " + counter.count);
    }
}
