package lec36.concurrency.executors.running;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyExecutorTask implements Runnable {

	int taskNumber;

	MyExecutorTask(int taskNumber) {
		this.taskNumber = taskNumber;
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + " executing task no " + taskNumber);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

public class ExecutorServiceExample {

	// nThreads number of threads will be created and started in executor.
	// here we will create 2 threads.
	private static int nThreads = 2;

	// nTasks number of tasks will be executed.
	// here we will execute 10 tasks.
	private static int nTasks = 10;

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(nThreads);
		System.out.println("executor created with 2 threads.");

		System.out.println("2 threads in executor will be used for executing 10 tasks. "
				+ "So, at a time only 2 tasks will be executed");
		for (int i = 1; i <= nTasks; i++) {
			Runnable task = new MyExecutorTask(i);
			executor.execute(task);
		}

		/*
		 * Initiates shutdown of executor, previously submitted tasks are
		 * executed, but no new tasks will be accepted.
		 */
		executor.shutdown();
		
		//executor.execute(new MyExecutorTask(11));

		System.out.println("executor has been shutDown.");
	}
}