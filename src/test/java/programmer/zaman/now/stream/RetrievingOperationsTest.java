package programmer.zaman.now.stream;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class RetrievingOperationsTest {

	@Disabled
	@Test
	public void testLimit() {
		List.of("Andres", "Nodas", "Programmer", "Zaman", "Now").stream()
			.limit(2)
			.forEach(System.out::println);
		
		/* Andres
		 * Nodas
		 * */
	}
	
	@Disabled
	@Test
	public void testSkip() {
		List.of("Andres", "Nodas", "Programmer", "Zaman", "Now").stream()
			.skip(2)
			.forEach(System.out::println);
		
		/* Programmer
		 * Zaman
		 * Now
		 * */
	}
	
	@Test
	public void testTakeWhile() {
		List.of("Andres", "Nodas", "Programmer", "Zaman", "Now").stream()
			.takeWhile(name -> name.length() <= 6)
			.forEach(System.out::println);
		
		/* Andres
		 * Nodas
		 * */
	}
	
	@Test
	public void testDropWhile() {
		List.of("Andres", "Nodas", "Programmer", "Zaman", "Now").stream()
			.dropWhile(name -> name.length() <= 6)
			.forEach(System.out::println);
		
		/* Programmer
		 * Zaman
		 * Now
		 * */
	}
	
	@Test
	public void testFindAny() {
		
		Optional<String> optional = List.of("Andres", "Nodas", "Programmer", "Zaman", "Now").stream()
				.findAny();
		
		optional.ifPresent(name -> {
			System.out.println("Find Any " + name);
		});
		
	}
	
	@Test
	public void testFindFirst() {
		
		Optional<String> optional = List.of("Andres", "Nodas", "Programmer", "Zaman", "Now").stream()
				.findFirst();
		
		optional.ifPresent(name -> {
			System.out.println("Find First " + name);
		});
		
	}
	
}
