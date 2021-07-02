package programmer.zaman.now.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class ContohStreamOperationsTest {

	@Test
	public void testMapStream() {
		
		List<String> names = List.of("Andres", "Nodas");
		Stream<String> streamNames = names.stream();
//		Stream<String> streamUpper = streamNames.map(value -> value.toUpperCase());
		Stream<String> streamUpper = streamNames.map(String::toUpperCase);
		streamUpper.forEach(System.out::println);
		/* ANDRES
		 * NODAS
		 * */
		
		names.forEach(System.out::println);
		/* Andres
		 * Nodas
		 * */
	}
	
}
