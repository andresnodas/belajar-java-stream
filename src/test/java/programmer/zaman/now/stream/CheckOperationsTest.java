package programmer.zaman.now.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CheckOperationsTest {

	@Test
	public void testCheckOperations() {
		
		List<String> names = List.of("Andres", "Nodas", "Programmer", "Zaman", "Now");
		
		boolean anyMatch = names.stream().anyMatch(name -> name.length() > 10);
		boolean allMatch = names.stream().allMatch(name -> !name.isBlank());
		boolean noneMatch = names.stream().noneMatch(name -> name.equals(name.toUpperCase()));
		
		System.out.println("Any match " + anyMatch);
		System.out.println("All match " + allMatch);
		System.out.println("None match " + noneMatch);
	}
	
}
