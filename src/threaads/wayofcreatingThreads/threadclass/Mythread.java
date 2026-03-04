package threaads.wayofcreatingThreads.threadclass;

 class MyTask implements Runnable{
    public void run(){
        System.out.println("thread is running...");
    }
}

public class Mythread {
    public static void main(String[] args) {
        MyTask obj = new MyTask();
        Thread f = new Thread(obj);
        f.start();

        for(int i=0; i<10; i++){
            System.out.println("main is running....");
        }
    }

}
