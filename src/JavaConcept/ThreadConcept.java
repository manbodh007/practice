package JavaConcept;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadConcept {
	private static final Set<String> keyContainer = ConcurrentHashMap.newKeySet();

	public static void main(String[] args) {

		Runnable task1 = () -> System.out.println("task 1 is running");
		Runnable task2 = () -> System.out.println("task 2 is running");
		Runnable task3 = () -> System.out.println("task 3 is running");
		Runnable task4 = () -> System.out.println("task 4 is running");
		Thread thread = new Thread(task1);
		thread.start();

	}

	public static void lockKey(String key) throws InterruptedException {
		while (true) {
			synchronized (ThreadConcept.class) {
				if (keyContainer.contains(key)) {
					Thread.sleep(2000);
				} else {
					keyContainer.add(key);
					break;
				}
			}
		}
	}

	public static void unloack(String key){
		keyContainer.remove(key);
	}
}
