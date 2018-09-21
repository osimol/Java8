/**
 * Use flatMap() methods in the Stream API
 */
package apistream.collection;

import java.util.Arrays;
import java.util.List;

public class D_FlatMap {

	public static void main(String[] args) {
		String []string= "you never know what you have until you clean your room".split(" ");
		Arrays.stream(string)
		.flatMap(word -> Arrays.stream(word.split("")))
		.peek(str -> System.out.print(str.toUpperCase()))
		.distinct()
		.forEach(System.out::print);
		
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		integers.stream()
		.map(i -> i * i)
		.forEach(System.out::println);
		
		List<List<Integer>> intsOfInts = Arrays.asList(
				Arrays.asList(1, 3, 5),
				Arrays.asList(2, 4),
				Arrays.asList(2, 4));
				intsOfInts.stream()
				.flatMap(ints -> ints.stream())
				.sorted()
				.map(i -> i * i)
				.forEach(System.out::println);
				
				
		
	}
}
