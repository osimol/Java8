package function.predicate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class A_Predicate {
	public static void main(String[] args) {
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = x -> x.isEmpty();
		Predicate<Persona> predicadoVaron = Persona::getVaron;
		
		System.out.println(p1.test(""));
		System.out.println(p2.test(""));
		
		Persona chico = new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1990, 1, 2),"F");
		System.out.printf("%s es varon? %b \n",chico.getNombre(),predicadoVaron.test(chico));
		
		BiPredicate<String, String> b1 = String::startsWith;
		BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
		System.out.println(b1.test("chicken", "a"));
		System.out.println(b2.test("chicken", "chick"));
		
		Predicate<String> nullCheck = arg -> arg != null;
		Predicate<String> emptyCheck = arg -> arg.length() > 0;
		Predicate<String> nullAndEmptyCheck = nullCheck.and(emptyCheck);
		
		String helloStr = "hello";
		System.out.println(helloStr + nullAndEmptyCheck.test(helloStr));
		String nullStr = null;
		System.out.println(nullStr + nullAndEmptyCheck.test(nullStr));
	}
}
