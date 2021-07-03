package programmer.zaman.now.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class TestForEachOperations {

	@Test
	public void testPeekOperation() {
		
		List<String> names = List.of("Andres", "Nodas", "Programmer", "Zaman", "Now");
		names.stream()
			.map(name -> name.toUpperCase())
			.peek(System.out::println)
			.forEach(System.out::println); //Stream berjalan
	}
	
}
