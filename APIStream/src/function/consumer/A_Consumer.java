package function.consumer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class A_Consumer {
	public static void main(String[] args) {
		Supplier<LocalDate> today = LocalDate::now;
		Supplier<LocalDate> hoy = () -> LocalDate.now();
		
		LocalDate d1 = today.get();
		LocalDate d2 = hoy.get();
		
		System.out.println(d1);
		System.out.println(d2);
		
		Supplier<StringBuilder> s11 = StringBuilder::new;
		Supplier<StringBuilder> s2 = () -> new StringBuilder();
		
		Supplier<ArrayList<String>> s1 = ArrayList<String>::new;
		ArrayList<String> a1 = s1.get();
		System.out.println(a1);
		System.out.println(s1);
		
		ArrayList<String> array = new ArrayList<String>();
		System.out.println(array);
	}
}
