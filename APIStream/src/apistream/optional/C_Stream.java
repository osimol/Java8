
package apistream.optional;

import java.util.Optional;

public class C_Stream {

	public static void main(String[] args) {
		Optional<String> palabra = Optional.of(" abracadabra ");
		palabra.map(String::trim).ifPresent(System.out::println);
		
		Optional<String> string = Optional.ofNullable(null);
		System.out.println(string.map(String::length).orElse(-1));
		
		Optional<String> cadena = Optional.ofNullable(null);
		System.out.println(cadena.map(String::length).orElseThrow(IllegalArgumentException::new));
	}

	
}
