package lec36.concurrency.executors.running;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class UsingFixedThreadPool {
	
	public static void main(String[] args) {
		System.out.println("Main thread starts here...");
		
		ExecutorService execService = Executors.newFixedThreadPool(3);
		
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		
		execService.shutdown();
		// As service been already shutdown so new tasks will not be accepted  for submission
		//execService.execute(new LoopTaskA());
		
		System.out.println("Main thread ends here...");
		
	}
}
