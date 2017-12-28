package lec31.concurrency.sleepJoinYield;
public class ThreadGroupTest {
    public static void main(String[] args) {
 
           //When program starts JVM creates a ThreadGroup named main
           System.out.println("current ThreadGroup name (created by JVM) = "
                        +Thread.currentThread().getThreadGroup().getName());
           
           /* Unless specified, all  newly created threads
            * become members of the main ThreadGroup.
            */
           Thread thread1 = new Thread("Thread-1");
           Thread thread2 = new Thread("thread-2");
 
           System.out.println("Thread-1's ThreadGroup = "
                         +thread1.getThreadGroup().getName());
           System.out.println("Thread-2's ThreadGroup = "
                         +thread2.getThreadGroup().getName());
           
    }
}