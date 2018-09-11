package function.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonaPredicates {
	public static Predicate<Persona> isAdultMale() {
		return p -> p.getEdad() > 18 && p.getSexo().equalsIgnoreCase("M");
	}

	public static Predicate<Persona> isAdultFemale() {
		return p -> p.getEdad() > 18 && p.getSexo().equalsIgnoreCase("F");
	}

	public static Predicate<Persona> isAgeMoreThan(Integer age) {
		return p -> p.getEdad() > age;
	}

	public static List<Persona> filterPersonas(List<Persona> personas, Predicate<Persona> predicate) {
		return personas.stream().filter(predicate).collect(Collectors.<Persona>toList());
	}
}
