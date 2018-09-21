
package apistream.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class A_FirstExample {

	public static void main(String[] args) {
		selectHighestTemperature(Stream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3));
		selectHighestTemperature(Stream.of());
	}

	public static void selectHighestTemperature(Stream<Double> temperatures) {
		Optional<Double> max = temperatures.max(Double::compareTo);
		if (max.isPresent()) {
			System.out.println(max.get());
		}
	}
}
