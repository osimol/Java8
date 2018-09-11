/**
 * 
 */
package function.predicate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import static function.predicate.PersonaPredicates.*;

/**
 * @author
 *
 */
public class EjemploPredicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creamos una lista de personas
		List<Persona> listaPersonas = new ArrayList<>();

		listaPersonas.add(new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1990, 1, 2),"M"));
		listaPersonas.add(new Persona("23456789B", "Juan", "Martínez", LocalDate.of(1981, 2, 3),"M"));
		listaPersonas.add(new Persona("34567890C", "Ana", "Ramírez", LocalDate.of(1972, 3, 4),"F"));
		listaPersonas.add(new Persona("45678901D", "María", "López", LocalDate.of(1993, 4, 5),"F"));

		// Mostramos una lista de personas que tienen 35 años o mas.
		listaPersonas.stream().filter((p) -> p.getEdad() >= 35l).forEach(System.out::println);

		// Crear una clase predicado.
		Predicate<Persona> predicateEdad = (p) -> p.getEdad() >= 35l;
		listaPersonas.stream().filter(predicateEdad).forEach(System.out::println);
		
		Predicate<Persona> predicateNombre = (p) -> p.getApellidos().contains("e");
		// Generamos un predicado "compuesto"
		Predicate<Persona> predicateCompuesto = predicateEdad.or(predicateNombre);

		System.out.println("");
		listaPersonas.stream().filter(predicateCompuesto).forEach(System.out::println);		
		
		
		// Predicado con retorno de valores.
		Persona persona = listaPersonas.stream()
                .filter(p -> {
                    if ("Pepe".equals(p.getNombre()) && 20 == p.getEdad()) {
                        return true;
                    }
                    return false;
                }).findAny()
                .orElse(null);
		System.out.println(persona);
		
		
		//Agrupacion de Predicados en una clase.
		System.out.println(filterPersonas(listaPersonas,isAdultMale()));

	}
	
}
