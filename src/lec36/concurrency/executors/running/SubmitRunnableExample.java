package lec36.concurrency.executors.running;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("MyRunnable's run()");

	}
}

public class SubmitRunnableExample {
	private static final int NTHREDS = 10;

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);

		Future<Integer> futureInteger = executor.submit(new MyRunnable(), 5);
		System.out.println("futureInteger.get() > " + futureInteger.get());

		Future<?> future = executor.submit(new MyRunnable());
		System.out.println("future.get() > " + future.get());
		
		executor.shutdown();
	}
}