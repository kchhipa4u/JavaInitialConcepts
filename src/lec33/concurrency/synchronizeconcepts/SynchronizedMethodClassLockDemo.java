package lec33.concurrency.synchronizeconcepts;

class MyRunnable2 implements Runnable {

	@Override
	public void run() {
		method1();

	}

	public static synchronized void method1() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " " + Thread.currentThread().getName() + " is executing");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class SynchronizedMethodClassLockDemo {
	public static void main(String args[]) throws InterruptedException {

		MyRunnable2 object1 = new MyRunnable2();
		MyRunnable2 object2 = new MyRunnable2();

		Thread thread1 = new Thread(object1, "Thread-1");
		Thread thread2 = new Thread(object2, "Thread-2");
		thread1.start();
		thread2.start();

	}

}