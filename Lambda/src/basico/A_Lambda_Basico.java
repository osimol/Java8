/**
 * Uso del API Stream junto con expresiones Lambda
 */
package basico;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class A_Lambda_Basico {
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// Ordenar una lista de nuemeros de forma inversa
		lista.sort((Integer a, Integer b) -> (-a.compareTo(b)));
		lista.forEach(System.out::print);

		List<Persona> list = Arrays.asList(new Persona("12345678A", "Pepe", "Pérez Pérez", LocalDate.of(1990, 1, 1)),
				new Persona("12345678A", "Ana", "López Almagro", LocalDate.of(1996, 4, 21)),
				new Persona("12345678A", "Martin", "Casillas Cuenca", LocalDate.of(1991, 12, 12)));
		// Ordenar una lista de objetos (personas) por nombre
		list.sort((o1, o2) -> o1.getNombre().compareTo(o2.getNombre()));

		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Recorrer la lista con forEach
		lista.forEach(e -> System.out.println(e));

		// Recorrer la lista usando una referencias a métodos con ::
		lista.forEach(System.out::println);

		// Bloque de sentencias que suma un valor fijo a los elementos de la lista
		l.forEach((e) -> {
			e = e + 1;
			System.out.println(e);
		});
	}
}
