package programmer.zaman.now.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class AggregateOperationsTest {

	@Test
	public void testAggregateOperations() {
		
		List<String> names = List.of("Andres", "Nodas", "Programmer", "Zaman", "Now");
		
		Optional<String> max = names.stream().max(Comparator.naturalOrder());
		max.ifPresent(System.out::println);
		
		Optional<String> min = names.stream().min(Comparator.naturalOrder());
		min.ifPresent(System.out::println);
		
		long count = names.stream().count();
		System.out.println(count);
		
	}
	
	@Test
	public void testReduceOperator() {
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		
		Integer sum = numbers.stream().reduce(0, (result, item) -> result + item);
		Integer factorial = numbers.stream().reduce(1, (result, item) -> result * item);
		
		System.out.println(sum);
		System.out.println(factorial);
		
	}
	
}
