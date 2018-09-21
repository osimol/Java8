
package apistream.statistics;

import java.util.stream.IntStream;

public class B_Reduce {

	public static void main(String[] args) {
		System.out.println(IntStream.of(10, 20, 30, 40).sum());

		System.out.println(IntStream.of(10, 20, 30, 40).reduce(0, ((sum, val) -> sum + val)));
		
		// factorial of 5
		System.out.println(IntStream.rangeClosed(1, 5).reduce((x, y) -> (x * y)).getAsInt());
		// prints: 120
	}
}
