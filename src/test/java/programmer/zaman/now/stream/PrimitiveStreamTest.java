package programmer.zaman.now.stream;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class PrimitiveStreamTest {

	@Test
	public void testCreatePrimitiveStream() {
		
		IntStream intStream1 = IntStream.of(1, 2, 3, 4, 5);
		IntStream intStream2 = IntStream.range(1, 10); // 1-9
		IntStream intStream3 = IntStream.rangeClosed(1, 10); // 1-10
		IntStream intStream4 = IntStream.builder().add(1).add(2).build();
		
		intStream3.forEach(System.out::println);
	}
	
	@Test
	public void testOperationsPrimitiveStream() {
		
		OptionalDouble averange = IntStream.range(1, 10).average();
		Stream<String> stream = IntStream.range(1, 10).mapToObj(value -> String.valueOf(value));
		
		averange.ifPresent(value -> System.out.println("Averange " + value));
		stream.forEach(value -> System.out.println("String " + value));
		
	}
	
}
