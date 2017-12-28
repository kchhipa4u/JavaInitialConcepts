package lec33.concurrency.synchronizeconcepts;

/**
 * @author kanhaiya.chhipa
 * 
 *  Suppose you have thread and it is in static synchronized method and now can thread enter other static synchronized 
 *  method from that method?
 *  
 *  Answer :- YES
 *   here when thread is in static synchronized method it must be holding lock on class’s class object and using that 
 *   lock thread can enter other static synchronized method.
 *
 */
class Task5 implements Runnable {

	@Override
	public void run() {
		method1();
	}

	static synchronized void method1() {
		System.out.println("static synchronized method1() started");
		method2();
		System.out.println("static synchronized method1() ended");
	}

	static synchronized void method2() {
		System.out.println("static in synchronized method2()");
	}

}

public class ObjectLockScenario6 {
	public static void main(String args[]) throws InterruptedException {

		Task5 task5 = new Task5();

		Thread thread1 = new Thread(task5, "Thread-1");
		thread1.start();
		
	}

}