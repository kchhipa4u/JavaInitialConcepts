package lec35.concurrency.lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadLockTest {
	public static void main(String[] args) {
		ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
		MyRunnable7 myRunnable = new MyRunnable7(readWriteLock);
		new Thread(myRunnable, "Thread-1").start();
		new Thread(myRunnable, "Thread-2").start();
	}
}

class MyRunnable7 implements Runnable {

	ReadWriteLock readWriteLock;

	public MyRunnable7(ReadWriteLock readWriteLock) {
		this.readWriteLock = readWriteLock;
	}

	public void run() {

		/*
		 * More than one threads can acquire readLock at a time provided no
		 * other thread is acquiring writeLock at same time.
		 */
		readWriteLock.readLock().lock();

		System.out.println(Thread.currentThread().getName() + " has acquired read lock.");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " has released read lock.");

		readWriteLock.readLock().unlock();

	}
}