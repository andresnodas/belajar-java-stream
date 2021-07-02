package programmer.zaman.now.stream;

import java.security.Principal;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CreateStreamTest {

	@Test
	public void testCreateEmptyOrSingleStream() {
		
		Stream<String> stream1 = Stream.of("Andres");
		
		Stream<String> stream2 = Stream.empty();
		
		String data = null;
		Stream<String> stream3 = Stream.ofNullable(data);
		
	}
	
	@Test
	public void testCreateStreamFromArray() {
		
		Stream<String> streamString = Stream.of("Andres", "Nodas");
		streamString.forEach(value -> System.out.println(value));
		
		Stream<Integer> streamInteger = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		streamInteger.forEach(value -> System.out.println(value));
		
		Stream<String> streamArray = Arrays.stream(new String[] {"Andres", "Nodas"});
		streamArray.forEach(value -> System.out.println(value));
	}
	
	@Test
	public void testCreateStreamFromCollection() {
		
		Collection<String> collectionString = List.of("Andres", "Nodas");
		
		Stream<String> streamString = collectionString.stream();
		streamString.forEach(System.out::println);
		streamString.forEach(System.out::println); //Error
		
	}
	
	@Test
	public void testCreateInfiniteStream() {
		
		Stream<String> stream = Stream.generate(() -> "Andres Nodas");
//		stream.forEach(System.out::println);
		
		Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
//		iterate.forEach(System.out::println);
		
	}
	
}
