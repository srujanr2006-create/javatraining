package threaads.wayofcreatingThreads.threadclass.methods;

class Mythread extends Thread {
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("Thread1 is running" + i);
            try{
                Thread.sleep(10000);
            }catch(Exception e){}

        }
    }
}

public class Sleep{
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.start();
        try{
            Thread.sleep(1000);
        }catch(Exception e){}

        for(int i=1; i<=10; i++){
            System.out.println("main thread is running"  + i);
        }
    }
}