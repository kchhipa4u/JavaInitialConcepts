package lec31.concurrency.sleepJoinYield;

import java.util.concurrent.TimeUnit;

public class UserAndDaemonThread {

	public static void main(String[] args) {
		Thread user = new Thread(new UserTask(), "User Thread");
		Thread daemon = new Thread(new DaemonThreadTask(), "Daemon Thread");
		daemon.setDaemon(true);
		
		user.start();
		daemon.start();
	}
}

class UserTask implements Runnable
{
	@Override
	public void run() {
		int x = 10;
		 
		while (x > 0) {
			System.out.println("User thread: " + x--);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
    }
	
}

class DaemonThreadTask implements Runnable{

	@Override
	public void run() {
		while (true) {
			System.out.println("Daemon thread is running...");
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

		}
	}
	
}
