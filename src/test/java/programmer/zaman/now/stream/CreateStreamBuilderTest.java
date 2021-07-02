package programmer.zaman.now.stream;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CreateStreamBuilderTest {

	@Test
	public void testCreateStreamBuilder() {
		
		Stream.Builder<String> stringBuilder = Stream.builder();
		stringBuilder.accept("Andres");
		stringBuilder.add("Andres").add("Nodas");
		
		Stream<String> names = stringBuilder.build();
		names.forEach(System.out::println);
		
	}
	
	@Test
	public void testCreateStreamBuilderSimplify() {
		
		Stream<String> names = Stream.<String>builder()
				.add("Andres").add("Nodas").build();
		
		names.forEach(System.out::println);
	}
	
}
