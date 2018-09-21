/**
 * Sort a collection using Stream API
 */
package apistream.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C_Collect {

	public static void main(String[] args) {
		String frenchCounting = "un:deux:trois:quatre";
		List<String> gmailList = Pattern.compile(":").splitAsStream(frenchCounting).collect(Collectors.toList());
		// gmailList.forEach(System.out::println);

		Stream<String> words = Stream.of("un", "deux", "trois", "quatre");
		List<String> wordsList = words.collect(Collectors.toList());
		// wordsList.forEach(System.out::println);

		String[] roseQuote = "a rose is a rose is a rose a apple".split(" ");
		Set<String> palabras = Arrays.stream(roseQuote).collect(Collectors.toSet()); // Set
																						// removes
																						// duplicates
		palabras.forEach(System.out::println);

		Map<String, Integer> nameLength = Stream.of("Arnold", "Alois", "Schwarzenegger")
				.collect(Collectors.toMap(String::toUpperCase, name -> name.length()));
		nameLength.forEach((name, len) -> System.out.printf("%s - %d \n", name, len));
		
		// Function.identity()
		Map<String, Integer> nombres = Stream.of("Arnold", "Alois", "Schwarzenegger")
				.collect(Collectors.toMap(Function.identity(), name -> name.length()));
		nombres.forEach((name, len) -> System.out.printf("%s - %d \n", name, len));
		
		// TreeSet : No repetidos y ordenados
		Set wordsRose = Arrays.stream(roseQuote).collect(Collectors.toCollection(TreeSet::new));
		wordsRose.forEach(System.out::println);
		
		// GroupingBy : organizes the results in a Map<K, List<T>>
		String []string= "you never know what you have until you clean your room".split(" ");
		Stream<String> distinctWords = Arrays.stream(string).distinct();
				
		Map<Integer, List<String>> wordGroups = distinctWords.collect(Collectors.groupingBy(String::length));
		wordGroups.forEach(
				(count, word) -> {
				System.out.printf("word(s) of length %d %n", count);
				word.forEach(System.out::println);
				});
		
		// PartitioningBy : organizes the results in a Map<Boolean, List<T>>
		Stream<String> distinctBlocks = Arrays.stream(string).distinct();
		Map<Boolean, List<String>> wordBlocks = distinctBlocks.collect(Collectors.partitioningBy(str -> str.length() > 4));
		System.out.println("Short words (len <= 4): " + wordBlocks.get(false));
		System.out.println("Long words (len > 4): " + wordBlocks.get(true));
		
	}
}
