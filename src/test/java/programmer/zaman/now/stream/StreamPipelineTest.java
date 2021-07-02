package programmer.zaman.now.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class StreamPipelineTest {

	@Test
	public void createStreamPipelineTest() {
		
		List<String> names = List.of("Andres", "Nodas");
		
		names.stream()
			.map(value -> value.toUpperCase())
			.map(value -> "Mr. " + value)
			.forEach(System.out::println);
		
	}
	
}
