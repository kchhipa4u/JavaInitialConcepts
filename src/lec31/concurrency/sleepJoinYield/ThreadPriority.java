package lec31.concurrency.sleepJoinYield;
class MyPriorityTask implements Runnable{
    public void run(){
           System.out.println(Thread.currentThread().getName()+"'s priority = "
                     +Thread.currentThread().getPriority());
    }
}
 
public class ThreadPriority {
    public static void main(String...args){
    	MyPriorityTask myRunnable=new MyPriorityTask();
           Thread thread1=new Thread(myRunnable,"Thread-1");
           Thread thread2=new Thread(myRunnable,"Thread-2");
           Thread thread3=new Thread(myRunnable,"Thread-3");
           thread1.setPriority(Thread.MAX_PRIORITY); //setting thread priority to 10
           thread2.setPriority(Thread.NORM_PRIORITY);  //setting thread priority to 5
           thread3.setPriority(Thread.MIN_PRIORITY); //setting thread priority to 1
           thread1.start();
           thread2.start();
           thread3.start();
    }
}