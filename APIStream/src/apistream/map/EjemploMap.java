/**
 * Develop code to extract data from an object using peek() and map() methods including primitive
versions of the map() method
 */
package apistream.map;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * 
 * @author
 *
 */

public class EjemploMap {

	public static void main(String[] args) {
		long count = Stream.of(1, 2, 3, 4, 5).map(i -> i * i).count();
		System.out.printf("The stream has %d elements \n", count);

		long count2 = Stream.of(1, 2, 3, 4, 5).map(i -> i * i).peek(i -> System.out.printf("%d ", i)).count();
		System.out.printf("%nThe stream has %d elements \n", count2);
		
		Stream.of(1, 2, 3, 4, 5)
		.peek(i -> System.out.printf("%d ", i))
		.map(i -> i * i)
		.peek(i -> System.out.printf("%d ", i))
		.map(i -> i + 1 )
		.peek(i -> System.out.printf("%d \n", i))
		.count();
		
		DoubleStream.of(1.0, 4.0, 9.0)
		.map(Math::sqrt)
		.peek(System.out::println)
		.sum();

	}
}
