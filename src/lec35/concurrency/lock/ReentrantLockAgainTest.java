package lec35.concurrency.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockAgainTest {
	public static void main(String[] args) {

		Lock lock = new ReentrantLock();
		MyRunnable6 myRunnable = new MyRunnable6(lock);
		new Thread(myRunnable, "Thread-1").start();
		new Thread(myRunnable, "Thread-2").start();

	}
}

class MyRunnable6 implements Runnable {

	Lock lock;

	public MyRunnable6(Lock lock) {
		this.lock = lock;
	}

	public void run() {

		System.out.println(Thread.currentThread().getName() + " is Waiting to acquire lock");

		lock.lock();  //1
		System.out.println();
		System.out.println(Thread.currentThread().getName() + " has called lock(), lockHoldCount=1 ");

		lock.lock();  // 2
		System.out.println(Thread.currentThread().getName() + " has called lock(), lockHoldCount=2 ");

		System.out
				.println(Thread.currentThread().getName() + " is about to call unlock(), lockHoldCount will become 1 ");
		lock.unlock();

		System.out
				.println(Thread.currentThread().getName() + " is about to call unlock(), lockHoldCount will become 0 ");
		lock.unlock();

	}
}