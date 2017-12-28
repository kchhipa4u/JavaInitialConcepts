package lec35.concurrency.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTryLockTest {
	public static void main(String[] args) {

		Lock lock = new ReentrantLock();
		MyRunnable1 myRunnable = new MyRunnable1(lock);
		new Thread(myRunnable, "Thread-1").start();
		new Thread(myRunnable, "Thread-2").start();

	}
}

class MyRunnable1 implements Runnable {

	Lock lock;

	public MyRunnable1(Lock lock) {
		this.lock = lock;
	}

	public void run() {

		System.out.println(Thread.currentThread().getName() + " is Waiting to acquire lock");

		if (lock.tryLock()) {
			System.out.println(Thread.currentThread().getName() + " has acquired lock.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println(Thread.currentThread().getName() + " didn't got lock.");

		}

	}
}

/*
 * Thread-1 is Waiting to acquire lock Thread-2 is Waiting to acquire lock
 * 
 * Thread-1 has acquired lock. thread-1 called lock.tryLock(), lock was
 * available. So, thread-1 acquired lock, method returned true and entered into
 * if block.
 * 
 * Thread-2 didn't got lock. thread-2 called lock.tryLock(), lock wasn’t
 * available. So, method returned false and entered else block.
 */
