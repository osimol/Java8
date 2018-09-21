
package apistream.optional;

import java.util.Optional;

public class B_Crear {

	public static void main(String[] args) {
		Optional<String> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		
		Optional<String> nonEmptyOptional = Optional.of("abracadabra");
		System.out.println(nonEmptyOptional);
		
		Optional<String> nullableOptional = Optional.ofNullable(null);
		System.out.println(nullableOptional);
		
		Optional<String> nullOptional = Optional.of(null);
		System.out.println(nullOptional);
	}

	
}
