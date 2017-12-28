package lec33.concurrency.synchronizeconcepts;

public class MyTask implements Runnable {

	static MyTask obj = new MyTask();
	
	
	public void run() {
		method1();
	}

	private void method1() {

		synchronized (obj) {
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
	
	public static void main(String[] args) {
		Thread t1 = new Thread(obj, "Thread-1"); // Thread-1 on obj.
		Thread t2 = new Thread(obj, "Thread-2"); // Thread-2 on obj.
		
		t1.start();
		t2.start();
	}

}
