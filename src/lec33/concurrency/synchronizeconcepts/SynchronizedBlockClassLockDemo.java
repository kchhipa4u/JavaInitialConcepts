package lec33.concurrency.synchronizeconcepts;

class MyRunnable1 implements Runnable {

	@Override
	public void run() {
		m1();
	}

	private static void m1() {
		synchronized (SynchronizedBlockClassLockDemo.class) {

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

}

public class SynchronizedBlockClassLockDemo {
	public static void main(String args[]) throws InterruptedException {

		MyRunnable1 anil = new MyRunnable1();
		MyRunnable1 kanhaiya = new MyRunnable1();

		Thread thread1 = new Thread(anil, "Thread-1");
		Thread thread2 = new Thread(kanhaiya, "Thread-2");
		thread1.start();
		thread2.start();
	}

}