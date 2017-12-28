package lec33.concurrency.synchronizeconcepts;

/**
 * @author kanhaiya.chhipa
 * 
 *  Suppose you have 2 threads (Thread-1 and Thread-2) on same object. Thread-1 is in synchronized method1(), 
 *  can Thread-2 enter static synchronized method2() at same time?
 *  
 *  Answer :- YES
 *   here when Thread-1 is in synchronized method1() it must be holding lock on object�s monitor and 
 *   Thread-2 can enter static synchronized method2() by acquiring lock on class�s class(Task3.class) object.
 *
 */
class Task3 implements Runnable {

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("Thread-1"))
			method1();
		else
			method2();
	}

	synchronized void method1() {
		System.out.println(Thread.currentThread().getName() + " in static synchronized void method1() started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " in static synchronized void method1() ended");
	}

	static synchronized void method2() {
		System.out.println(Thread.currentThread().getName() + " in synchronized void method2() started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " in synchronized void method2() ended");
	}

}

public class ObjectLockScenario3 {
	public static void main(String args[]) throws InterruptedException {

		Task3 task3 = new Task3();

		Thread thread1 = new Thread(task3, "Thread-1");
		Thread thread2 = new Thread(task3, "Thread-2");
		thread1.start();
		Thread.sleep(10);// Just to ensure Thread-1 starts before Thread-2
		thread2.start();
	}

}