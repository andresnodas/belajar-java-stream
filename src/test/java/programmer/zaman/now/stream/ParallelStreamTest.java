package programmer.zaman.now.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ParallelStreamTest {

	@Test
	public void testSequentialStream() {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		numbers.stream()
			.forEach(number -> {
				System.out.println("Thread " + Thread.currentThread() + " : " + number);
			});
		//Thread Thread[main,5,main] : 1 ... 10
	}
	
	@Test
	public void testParallelStream() {

		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		numbers.stream().parallel()
			.forEach(number -> {
				System.out.println("Thread " + Thread.currentThread() + " : " + number);
			});
		
		/* Thread Thread[main,5,main] : 7
		 * Thread Thread[main,5,main] : 6
		 * Thread Thread[ForkJoinPool.commonPool-worker-7,5,main] : 8
		 * Thread Thread[ForkJoinPool.commonPool-worker-3,5,main] : 3
		 * Thread Thread[ForkJoinPool.commonPool-worker-9,5,main] : 5
		 * Thread Thread[ForkJoinPool.commonPool-worker-3,5,main] : 1
		 * Thread Thread[ForkJoinPool.commonPool-worker-5,5,main] : 9
		 * Thread Thread[ForkJoinPool.commonPool-worker-7,5,main] : 2
		 * Thread Thread[ForkJoinPool.commonPool-worker-11,5,main] : 10
		 * Thread Thread[ForkJoinPool.commonPool-worker-3,5,main] : 4
		 * */
	}

}
