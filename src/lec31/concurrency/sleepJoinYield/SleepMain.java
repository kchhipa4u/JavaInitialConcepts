package lec31.concurrency.sleepJoinYield;
 public class SleepMain {
    public static void main(String...args) throws InterruptedException{
           System.out.println(Thread.currentThread().getName() + " has started");
           Thread.sleep(2000);
           System.out.println(Thread.currentThread().getName() + " has ended");
    }
}