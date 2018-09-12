/**
 * Ejemplo de como verificar si el a�o de una fecha es bisiesto
 */

package fechas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class L_Bisiesto {
	public static void main(String[] args) {

		LocalDate today = LocalDate.now().plus(2, ChronoUnit.YEARS);
		if (today.isLeapYear()) {
			System.out.printf("El a�o %d es bisiesto", today.getYear());
		} else {
			System.out.printf("El a�o %d no es bisiesto", today.getYear());
		}

	}
}
