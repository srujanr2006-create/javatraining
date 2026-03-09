package threaads.wayofcreatingThreads.threadclass.methods;

    class Mythread2 extends Thread {
        public void run(){
            for(int i=1; i<=10; i++){
                System.out.println("Thread1 is running" + i);
                try{
                    Thread.sleep(1000);
                }catch (Exception a) {}
            }
        }
    }

    public class join{
        public static void main(String[] args) {
            Mythread2 t1 = new Mythread2();
            t1.start();
           try{
               t1.join();
           }catch (Exception a){}
            for(int i=1; i<=10; i++){
                System.out.println("main thread is running"  + i);
                try{
                    Thread.sleep(1000);

                }catch(Exception e){}


            }
        }
    }

