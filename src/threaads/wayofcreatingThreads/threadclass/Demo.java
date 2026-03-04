package threaads.wayofcreatingThreads.threadclass;

class MyThreads extends Thread {
    public void run(){
        for (int i=0; i<10; i++){
            System.out.println("Thread is running...");
        }
    }

}

public class Demo{
    public static void main(String[] args) {
        MyThreads m = new MyThreads();
        m.start();

        for (int i=0; i<10; i++){
            System.out.println("Main Thread if Running...");
        }
    }
}