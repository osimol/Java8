
package apistream.optional;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class D_Primitive {

	public static void main(String[] args) {
		selectHighestTemperature(DoubleStream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3));
	}

	public static void selectHighestTemperature(DoubleStream temperatures) {
		OptionalDouble max = temperatures.max();
		max.ifPresent(System.out::println);
	}
}
