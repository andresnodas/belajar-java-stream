package programmer.zaman.now.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class GroupingByTest {

	@Test
	public void testGroupingBy() {
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Map<Integer, List<Integer>> group1 = numbers.stream()
				.collect(Collectors.groupingBy(number -> number));
		System.out.println(group1);
		//{1=[1], 2=[2], 3=[3], 4=[4], 5=[5], 6=[6], 7=[7], 8=[8], 9=[9], 10=[10]}
		
		Map<String, List<Integer>> group2 = numbers.stream()
				.collect(Collectors.groupingBy(number -> number > 5 ? "Besar" : "Kecil"));
		System.out.println(group2);
		//{Besar=[6, 7, 8, 9, 10], Kecil=[1, 2, 3, 4, 5]}
		
		List<String> names = List.of("Andres", "Nodas", "Programmer", "Zaman", "Now");
		
		Map<String, List<String>> group3 = names.stream()
				.collect(Collectors.groupingBy(name -> name.length() > 5 ? "Panjang" : "Pendek"));
		System.out.println(group3);
		//{Panjang=[Andres, Programmer], Pendek=[Nodas, Zaman, Now]}
	}
	
}
