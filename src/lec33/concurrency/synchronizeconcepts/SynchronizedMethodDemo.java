package lec33.concurrency.synchronizeconcepts;

class MyRunnableTask implements Runnable {

	public void run() {
		method1();

	}

	public synchronized void method1() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " " + Thread.currentThread().getName() + " is executing");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class SynchronizedMethodDemo {
	public static void main(String args[]) throws Exception {

		MyRunnableTask obj = new MyRunnableTask();
		Thread t1 = new Thread(obj, "Thread-1"); // Thread-1 on obj.
		Thread t2 = new Thread(obj, "Thread-2"); // Thread-2 on obj.
		t1.start();
		t2.start();

	}
}