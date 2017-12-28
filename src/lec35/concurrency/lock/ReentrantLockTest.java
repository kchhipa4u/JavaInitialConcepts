package lec35.concurrency.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author kanhaiya.chhipa
 * 
 *  Thread-1 is Waiting to acquire lock
    Thread-2 is Waiting to acquire lock
	Thread-1 and Thread-2 are waiting to acquire lock.

	Thread-1 has acquired lock.
	Thread-1 has acquired lock by calling lock() method. (Now lock hold count=1)
	Thread-2 has also called lock() method, but it will have to wait until lock hold count becomes 0. 
	         (lock hold count will become 0 when Thread-1 will call unlock() method)

	Thread-1 is sleeping.
	Thread-1 has released lock.
	Thread-1 has released lock by calling unlock() method. (Now lock hold count=0)

	Thread-2 has acquired lock.
	Thread-2 has acquired lock by calling lock() method. (Now lock hold count=1)

	Thread-2 is sleeping.
	Thread-2 has released lock.
	Thread-2 has released lock by calling unlock() method. (Now lock hold count=0)
 
 *
 */
public class ReentrantLockTest {
    public static void main(String[] args) {
 
           Lock lock=new ReentrantLock();
           MyRunnable myRunnable=new MyRunnable(lock);
           new Thread(myRunnable,"Thread-1").start();
           new Thread(myRunnable,"Thread-2").start();
    }
}
 


 
class MyRunnable implements Runnable {

	Lock lock;

	public MyRunnable(Lock lock) {
		this.lock = lock;
	}

	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " is Waiting to acquire lock");

		lock.lock();

		System.out.println(Thread.currentThread().getName() + " has acquired lock.");

		try {
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " is sleeping.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " has released lock.");

		lock.unlock();
	}
}