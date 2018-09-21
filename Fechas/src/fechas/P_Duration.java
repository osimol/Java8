/**
 * Ejemplo de java.time.Duration para obtener los segundos de diferencia entre dos LocalDateTime
 */
package fechas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class P_Duration {
	public static void main(String[] args) {
		// Crear Durations
		System.out.println("--- Examples --- ");

		Duration oneHours = Duration.ofHours(1);
		System.out.println(oneHours.getSeconds() + " seconds");

		Duration oneHours2 = Duration.of(1, ChronoUnit.HOURS);
		System.out.println(oneHours2.getSeconds() + " seconds");

		// Test Duration.between
		System.out.println("\n--- Duration.between --- ");

		LocalDateTime oldDate = LocalDateTime.of(2016, Month.AUGUST, 31, 10, 20, 55);
		LocalDateTime newDate = LocalDateTime.of(2016, Month.NOVEMBER, 9, 10, 21, 56);

		System.out.println(oldDate);
		System.out.println(newDate);

		// Cuenta el numero de segundos entre dos fechas
		Duration duration = Duration.between(oldDate, newDate);

		System.out.println(duration.getSeconds() + " seconds");

		LocalDateTime comingMidnight = LocalDateTime.of(LocalDate.now().plusDays(1), LocalTime.MIDNIGHT);
		LocalDateTime now = LocalDateTime.now();
		Duration between = Duration.between(now, comingMidnight);
		System.out.println(between);
		
		System.out.println(Duration.ofDays(4));
		// returns "PT96H"
		System.out.println(Duration.ofHours(2));
		// returns "PT2H"
		System.out.println(Duration.ofMinutes(15));
		// returns "PT15M"
		System.out.println(Duration.ofSeconds(30));
		//returns "PT30S"
		System.out.println(Duration.ofMillis(120));
		// returns "PT0.12S"
		System.out.println(Duration.ofNanos(120));
		// returns "PT0.00000012S"

		System.out.println(Duration.parse("P2DT10H30M"));
	}
}
