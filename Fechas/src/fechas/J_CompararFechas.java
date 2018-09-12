/**
 * Ejemplo de como comparar si una fecha es anterior o posterior a otra
 */

package fechas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class J_CompararFechas {
	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalDate otraFecha = LocalDate.of(2019, 9, 12);
		if (otraFecha.isAfter(today)) {
			System.out.println("La otra fecha es posterior a la de hoy");
		}

		LocalDate ayer = today.minus(1, ChronoUnit.DAYS);
		if (ayer.isBefore(today)) {
			System.out.println("Ayer es anterior a hoy");
		}

		LocalDate hoy = LocalDate.now();
		if (hoy.isEqual(today)) {
			System.out.println("Hoy es hoy.");
		}

	}
}
