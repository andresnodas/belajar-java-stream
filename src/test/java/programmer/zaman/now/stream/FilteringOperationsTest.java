package programmer.zaman.now.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FilteringOperationsTest {

	@Test
	public void testFilteringOperations() {
		
		List<String> names = List.of("Andres", "Andres", "Nodas", "Programmer", "Zaman", "Now");
		
		names.stream().filter(name -> name.length() > 5).forEach(System.out::println);
		/* Andres
		 * Andres
		 * Programmer
		 * */
		
		names.stream().distinct().forEach(System.out::println);
		/* Andres
		 * Nodas
		 * Programmer
		 * Zaman
		 * Now
		 * */
		
	}
	
}
