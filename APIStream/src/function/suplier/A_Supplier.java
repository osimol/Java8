package function.suplier;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class A_Supplier {
	public static void main(String[] args) {
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println(x);
		c1.accept("Annie");
		c2.accept("Annie");

		Map<String, Integer> map = new HashMap<>();
		BiConsumer<String, Integer> b1 = map::put;
		BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
		b1.accept("chicken", 7);
		b2.accept("chick", 1);
		System.out.println(map);

		Map<Integer, Integer> m1 = new HashMap<>();
		Map<Integer, Integer> m2 = new HashMap<>();
		BiConsumer<Integer, Integer> bConsumer = (k, v) -> {
			if (k < 5) {
				m1.put(k, v);
			}
			m2.put(k, k);
		};

		for (int i = 1; i <= 10; i++) {
			bConsumer.accept(i, 0);
		}
		System.out.println(m1);
		System.out.println(m2);

	}
}
