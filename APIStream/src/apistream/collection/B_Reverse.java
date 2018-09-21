/**
 * Sort a collection using Stream API
 */
package apistream.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class B_Reverse {

	public static void main(String []args) {
		List<String> words = Arrays.asList("follow your heart but take your brain with you".split(" "));
		Comparator<String> comparatorLength = (str1, str2) -> str1.length() - str2.length();
		
		words.stream().distinct().sorted(comparatorLength.thenComparing(String::compareTo).reversed()).forEach(System.out::println);


	}
}
