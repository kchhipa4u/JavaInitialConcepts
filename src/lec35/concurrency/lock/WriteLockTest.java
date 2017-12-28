package lec35.concurrency.lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class WriteLockTest {
	public static void main(String[] args) {
		ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
		MyRunnable8 myRunnable = new MyRunnable8(readWriteLock);
		new Thread(myRunnable, "Thread-1").start();
		new Thread(myRunnable, "Thread-2").start();
	}
}

class MyRunnable8 implements Runnable {

	ReadWriteLock readWriteLock;

	public MyRunnable8(ReadWriteLock readWriteLock) {
		this.readWriteLock = readWriteLock;
	}

	public void run() {

		/*
		 * Only one threads can acquire writeLock at a time. Means writeLock can
		 * only be obtained if no other thread is acquiring read or write lock
		 * at that time.
		 */
		readWriteLock.writeLock().lock();

		System.out.println(Thread.currentThread().getName() + " has acquired write lock.");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " has released write lock.");

		readWriteLock.writeLock().unlock();

	}
}