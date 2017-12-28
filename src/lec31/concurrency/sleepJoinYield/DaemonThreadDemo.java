package lec31.concurrency.sleepJoinYield;

public class DaemonThreadDemo extends Thread{

	public static void main(String[] args) {
		System.out.println("Inside main method...");
		Thread t1 = new Thread(new DaemonTask(), "Thread-1");
		t1.setDaemon(true);
		t1.start();
	}
}

class DaemonTask implements Runnable {
	public void run() {
		System.out.println("Hello, I am Daemon thread: " + Thread.currentThread().getName());
		
		System.out.println("Is it Daemon Thread: " + Thread.currentThread().isDaemon());
		
		System.out.println("Default priority: " + Thread.currentThread().getPriority());
	}
}
