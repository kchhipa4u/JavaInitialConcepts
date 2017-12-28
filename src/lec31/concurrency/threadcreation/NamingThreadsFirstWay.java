package lec31.concurrency.threadcreation;



public class NamingThreadsFirstWay {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		
		System.out.println("[" + currentThreadName + "] Main thread starts here...");
		
		new Thread(new LoopTaskB()).start();
		
		Thread t2 = new Thread(new LoopTaskB());
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("[" + currentThreadName + "] Main thread ends here...");
	}
}
