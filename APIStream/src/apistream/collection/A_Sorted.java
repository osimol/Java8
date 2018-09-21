/**
 * Sort a collection using Stream API
 */
package apistream.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class A_Sorted {

	public static void main(String []args) {
		List<String> words = Arrays.asList("follow your heart but take your brain with you".split(" "));
		words.stream().distinct().sorted().forEach(System.out::println);
		
		System.out.println("--- --- --- --- --- --- --- ---");
				
		Comparator<String> comparatorLength = (str1, str2) -> str1.length() - str2.length();
		words.stream().distinct().sorted(comparatorLength).forEach(System.out::println);
		
		System.out.println("--- --- --- --- --- --- --- ---");
		
		Comparator<String> comparatorNatural = (str1, str2) -> str1.charAt(0) - str2.charAt(0);
		words.stream().distinct().sorted(comparatorLength.thenComparing(String::compareTo)).forEach(System.out::print);
		System.out.println("");
		words.stream().distinct().sorted(comparatorLength.thenComparing(comparatorNatural)).forEach(System.out::print);

	}
}
