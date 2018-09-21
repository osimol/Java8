/**
 * 
 */
package apistream.match;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * @author
 *
 */

public class B_FindFirstUse {

	public static void main(String[] args) {
		// Average temperatures in Concordia, Antarctica in a week in October 2015
		OptionalInt temperature  = IntStream.of(-56, -57, -55, -52, -48, -51, -49)
				.filter(i -> i > -50)
				.findFirst();
		System.out.println("Result: " + temperature.orElse(0));
		
		Method[] methods = Stream.class.getMethods();
		Optional<String> methodName = Arrays.stream(methods)
			.map(method -> method.getName())
			.filter(name -> name.endsWith("Match"))
			.sorted()
			.findFirst();
		System.out.println("Result: " + methodName.orElse("No suitable method found"));
		
	}
}
