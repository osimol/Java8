package apistream.filter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import function.function.Persona;

/**
 * 
 * @author
 *
 */

public class EjemploFindAny {

	public static void main(String[] args) {
		List<Persona> lista = Arrays.asList(new Persona("12345678A", "Pepe", "P�rez P�rez", LocalDate.of(1990, 1, 1)),
				new Persona("12345678A", "Mar�a", "L�pez Almagro", LocalDate.of(1996, 4, 21)),
				new Persona("12345678A", "Mart�n", "Casillas Cuenca", LocalDate.of(1991, 12, 12)));

		Persona persona = lista.stream().filter(n -> "Pepe".equals(n.getNombre())).findAny().orElse(null);

		System.out.println(persona);

		Persona persona2 = lista.stream().filter(n -> n.getNombre().equals("Carlos")).findAny().orElse(null);

		System.out.println(persona2);

	}
}
