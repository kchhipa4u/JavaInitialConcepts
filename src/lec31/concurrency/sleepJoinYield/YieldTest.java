package lec31.concurrency.sleepJoinYield;
class MyRunnable1 implements Runnable{
    public void run(){
           for(int i=0;i<5;i++){
                  Thread.yield();
                  System.out.println("i="+i+" ,ThreadName="+Thread.currentThread().getName());
           }          
    }
}
 
class MyRunnable2 implements Runnable{
    public void run(){
           for(int i=0;i<5;i++){
                  System.out.println("i="+i+" ,ThreadName="+Thread.currentThread().getName());
           }          
    }
}
 
public class YieldTest {
    public static void main(String...args){
           Thread thread1=new Thread(new MyRunnable1(),"Thread-1");
           Thread thread2=new Thread(new MyRunnable2(),"Thread-2");
           thread1.start();
           thread2.start();
    }
}