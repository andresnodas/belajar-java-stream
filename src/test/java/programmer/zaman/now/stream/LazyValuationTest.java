package programmer.zaman.now.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class LazyValuationTest {

	@Test
	public void testIntermediateOperations() {
		
		Stream<String> names = List.of("Andres", "Nodas").stream();
		
		Stream<String> upperNames = names.map(name -> {
			System.out.println("Change " + name + " to UPPERCASE");
			return name.toUpperCase();
		});
		
		upperNames.forEach(upperName -> {
			System.out.println(upperName);
		});
		
		/* Change Andres to UPPERCASE
		 * ANDRES
		 * Change Nodas to UPPERCASE
		 * NODAS
		 * */
		
	}
	
}
