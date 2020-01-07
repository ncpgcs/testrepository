package zilkiproj;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
public static void main(String[] args) {
	
	ExecutorService e=Executors.newFixedThreadPool(2);
	e.execute(new Runnable() {
		
		@Override
		public void run() {
			System.out.println("child thread");			
		}
	});
	e.execute(new Runnable() {
		
		@Override
		public void run() {
			System.out.println("another child thread...");
			
		}
	});
	System.out.println("main thread...");
	e.shutdown();
}
}
