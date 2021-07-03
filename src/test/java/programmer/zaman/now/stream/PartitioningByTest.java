package programmer.zaman.now.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class PartitioningByTest {

	@Test
	public void testPartitioningBy() {
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Map<Boolean, List<Integer>> partitioing = numbers.stream()
				.collect(Collectors.partitioningBy(number -> number > 5));
		System.out.println(partitioing);
		//{false=[1, 2, 3, 4, 5], true=[6, 7, 8, 9, 10]}
		
	}
	
}
