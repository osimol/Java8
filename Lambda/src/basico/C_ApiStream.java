package basico;

import java.util.Arrays;
import java.util.List;

public class C_ApiStream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//1º Imprimir todos los elementos de la lista
		list.stream().forEach(System.out::print);
		System.out.println();
		
		//2º Imprimir solo los mayores o iguales que 5
		list.stream().filter(x -> x > 5).forEach(System.out::print);
		System.out.println();
		
		//3º Imprimir solo los mayores o iguales que 5, ordenados inversamente
		list.stream().filter(x -> x > 5).sorted((n1,n2)->-(n1.compareTo(n2))).forEach(System.out::print);
		System.out.println();
		
		//4º Sumar todos los elementos mayores o igual que 5
		int suma = list.stream().mapToInt(x->x.intValue()).filter(y -> y >5).sum();
		System.out.println("La suma de los valores mayores de 5 es : " + suma);
		

	}

}
