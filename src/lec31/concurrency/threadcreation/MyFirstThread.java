package lec31.concurrency.threadcreation;

public class MyFirstThread {

	public static void main(String[] args) {
		System.out.println("Main thread starts...");
		
		Task task = new Task();
		Thread t1 = new Thread(task);
		t1.start();
		
		Thread t2 = new Thread(task);
		t2.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main thread ends...");
	}
}

class Task implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " -- Thread is working on assigned task -- " + i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
