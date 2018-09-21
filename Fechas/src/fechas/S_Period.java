package fechas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class S_Period {
	public static void main(String[] args) {
		LocalDate manufacturingDate = LocalDate.of(2017, Month.JANUARY, 1);
		LocalDate expiryDate = LocalDate.of(2018, Month.JULY, 18);
		Period expiry = Period.between(manufacturingDate, expiryDate);
		System.out.printf("Medicine will expire in: %d years, %d months, and %d days (%s)\n", expiry.getYears(),
				expiry.getMonths(), expiry.getDays(), expiry);

		LocalDate christmas = LocalDate.of(2015, 12, 25);
		System.out.println(Period.between(LocalDate.now(), christmas));

		System.out.println("Numero de dias en 3 semanas :" + Period.ofWeeks(3));
		System.out.println("Numero de dias en 3 semanas :" + Period.ofDays(15));
		System.out.println("Numero de dias en 3 semanas :" + Period.ofMonths(6));
		System.out.println("Numero de dias en 3 semanas :" + Period.ofYears(4));
		System.out.println("Numero de dias en 3 semanas :" + Period.parse("P4Y6M15D"));
	}
}
