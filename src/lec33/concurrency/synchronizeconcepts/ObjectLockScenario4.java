package lec33.concurrency.synchronizeconcepts;

/**
 * @author kanhaiya.chhipa
 * 
 *  Suppose you have thread and it is in synchronized method and now can thread enter other synchronized 
 *  method from that method?
 *  
 *  Answer :- YES
 *   here when thread is in synchronized method it must be holding lock on object’s monitor and using that lock thread 
 *   can enter other synchronized method.
 *
 */
class Task4 implements Runnable {

	@Override
	public void run() {
		method1();
	}

	synchronized void method1() {
		System.out.println("synchronized method1() started");
		method2();
		System.out.println("synchronized method1() ended");
	}

	synchronized void method2() {
		System.out.println("in synchronized method2()");
	}

}

public class ObjectLockScenario4 {
	public static void main(String args[]) throws InterruptedException {

		Task4 task4 = new Task4();

		Thread thread1 = new Thread(task4, "Thread-1");
		thread1.start();
		
	}

}