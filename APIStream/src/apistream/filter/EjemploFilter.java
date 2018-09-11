package apistream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author
 *
 */

public class EjemploFilter {

	public static void main(String[] args) {
		List<String> nombre = Arrays.asList("Marcos", "Lucas", "Juan", "Mateo");
		// Convertir List a Stream, añadir un filtro, obtener una coleccion.
		List<String> result = nombre.stream().filter(line -> !"Marcos".equals(line)).collect(Collectors.toList());
		result.forEach(System.out::println);

	}
}
