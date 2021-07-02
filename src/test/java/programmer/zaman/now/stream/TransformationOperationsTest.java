package programmer.zaman.now.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class TransformationOperationsTest {

	@Test
	public void testMap() {
		
		List<String> names = List.of("Andres", "Nodas");
		
		names.stream()
			.map(name -> name.toUpperCase()) // Menjadi Stream<String>
			.map(upper -> upper.length()) // Menjadi Stream<Integer>
			.forEach(length -> System.out.println(length));
		
	}
	
	@Test
	public void testFlatMap() {
		
		List<String> names = List.of("Andres", "Nodas");
		
		names.stream()
			.map(name -> name.toUpperCase()) 
			.flatMap(upper -> Stream.of(upper, upper.length()))
			.flatMap(value -> Stream.of(value, value, value))
			.forEach(length -> System.out.println(length));
		
		/* ANDRES
		 * ANDRES
		 * ANDRES
		 * 6
		 * 6
		 * 6
		 * NODAS
		 * NODAS
		 * NODAS
		 * 5
		 * 5
		 * 5
		 * */
	}
	
}
