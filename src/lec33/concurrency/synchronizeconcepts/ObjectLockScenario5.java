package lec33.concurrency.synchronizeconcepts;

/**
 * @author kanhaiya.chhipa
 * 
 *  Suppose you have thread and it is in static synchronized method and now can thread enter other non static 
 *  synchronized method from that method?
 *  
 *  Answer :- YES
 *   here when thread is in static synchronized method it must be holding lock on class’s class object and when it 
 *   enters synchronized method it will hold lock on object’s monitor as well. So, now thread holds 2 locks 
 *   (it’s also called nested synchronization)-
 *       >first one on class’s class object.
 *       >second one on object’s monitor (This lock will be released when thread exits non static method). 
 *       
 *  ================================================================================================================
 *  
 *  Suppose you have thread and it is in synchronized method and now can thread enter other static synchronized 
 *  method from that method?
 *  
 *  Answer :- YES
 *
 */
class Task6 implements Runnable {

	@Override
	public void run() {
		method1();
	}

	static synchronized void method1() {
		System.out.println("static synchronized method1() started");
		Task6 t = new Task6();
		t.method2();
		System.out.println("static synchronized method1() ended");
	}

	synchronized void method2() {
		System.out.println("static in synchronized method2()");
	}

}

public class ObjectLockScenario5 {
	public static void main(String args[]) throws InterruptedException {

		Task6 task6 = new Task6();

		Thread thread1 = new Thread(task6, "Thread-1");
		thread1.start();
		
	}

}