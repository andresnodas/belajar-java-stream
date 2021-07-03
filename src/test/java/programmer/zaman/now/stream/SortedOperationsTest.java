package programmer.zaman.now.stream;

import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SortedOperationsTest {

	@Test
	public void testOrderingOperation() {
		
		List<String> names = List.of("Andres", "Nodas", "Programmer", "Zaman", "Now");
		
		names.stream().sorted().forEach(System.out::println);
		names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
	
}
