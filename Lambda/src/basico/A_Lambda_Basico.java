package basico;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


public class A_Lambda_Basico {
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		lista.sort((Integer a, Integer b)->(-a.compareTo(b)));
		for(Integer i: lista){
			System.out.println(i);			
		}
		
		List<Persona> list = Arrays.asList(
				new Persona("12345678A", "Pepe", "Pérez Pérez", LocalDate.of(1990, 1, 1)),
				new Persona("12345678A", "Ana", "López Almagro", LocalDate.of(1996, 4, 21)),
				new Persona("12345678A", "Martin", "Casillas Cuenca", LocalDate.of(1991, 12, 12))				
				);
		list.sort((o1, o2)->o1.getNombre().compareTo(o2.getNombre()));
		for(Persona i: list){
			System.out.println(i);			
		}
		
List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//1ª Forma clásica de imprimir los elementos de una lista
//		for(Integer i: lista)
//			System.out.println(i);
		
		//2ª Uso de forEach
//		lista.forEach(e -> System.out.println(e));
		
		//3ª Uso de referencias a métodos con ::
//		lista.forEach(System.out::println);
		
		//4º Uso de un bloque de sentencias que suma un valor fijo a los 
		//elementos de la lista
		l.forEach((e) -> {
			e = e+1;
			System.out.println(e);
		});
	}
}
