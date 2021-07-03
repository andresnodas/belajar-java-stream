package programmer.zaman.now.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class TestCollectors {

	@Test
	public void testCollectorsCollection() {
		List<String> names = List.of("Andres", "Nodas", "Programmer", "Zaman", "Now");
	
		Set<String> setNames = names.stream().collect(Collectors.toSet());
		Set<String> immutableSet = names.stream().collect(Collectors.toUnmodifiableSet());
		
		List<String> listNames = names.stream().collect(Collectors.toList());
		List<String> immutableList = names.stream().collect(Collectors.toUnmodifiableList());
	}
	
	@Test
	public void testCollectorsToMap() {
		
		List<String> names = List.of("Andres", "Nodas", "Programmer", "Zaman", "Now");
		
		Map<String, Integer> map = names.stream().
				collect(Collectors.toMap(name -> name, name -> name.length()));
		
		System.out.println(map);
		//{Andres=6, Zaman=5, Programmer=10, Now=3, Nodas=5}
	}
	
}
