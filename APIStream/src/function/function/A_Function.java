package function.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class A_Function {
	public static void main(String[] args) {
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = x -> x.length();
				
		System.out.println(f1.apply("cluck")); // 5
		System.out.println(f2.apply("cluck")); // 5
		
		Function<List<Integer>, Integer> f3 = x -> x.size();
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println(f3.apply(numeros));
		
		BiFunction<String, String, String> b1 = String::concat;
		BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
		System.out.println(b1.apply("baby ", "chick")); // baby chick
		System.out.println(b2.apply("baby ", "chick")); // baby chick
		
		BiFunction<Integer, Integer, String> b3 = (Integer a, Integer b) -> Integer.toString(a + b);
		System.out.println(b3.apply(1,2));
		
		
        TriFunction<Boolean, Integer, Long, String> tri = (x,y,z) -> ""+x+","+y+","+z;
        System.out.println(tri.apply(false, 1, 2L)); //false,1,2

        tri = tri.andThen(s -> "["+s+"]");
        System.out.println(tri.apply(true,2,3L)); //[true,2,3]
	}
}
