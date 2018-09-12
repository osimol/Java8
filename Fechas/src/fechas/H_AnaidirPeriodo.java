/**
 * Ejemplo de como añadir una cantidad de tiempo a una fecha, 1 semana, 300 dias, 5 años 2 meses y tres dias, 19 meses ...
 */

package fechas;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class H_AnaidirPeriodo {

	
	public static void main(String[] args) {

		LocalDate nextWeek = LocalDate.now().plus(1, ChronoUnit.WEEKS);
		System.out.println("Hoy es : " + LocalDate.now());
		System.out.println("Dentro de 1 semana: " + nextWeek);

		LocalDate hoy = LocalDate.now();

        LocalDate hoyPlusDays = hoy.plus(Period.ofDays(300));
        System.out.println("Dentro de 300 dias: " + hoyPlusDays);

        LocalDate hoyPlusFecha = hoy.plus(Period.of(5, 2, 3));
        System.out.println("Dentro de 3 anios 2 meses y 3 dias : " + hoyPlusFecha);

        LocalDate hoyPlusMonths = hoy.plus(Period.ofMonths(19));
        System.out.println("Dentro de 19 meses: " + hoyPlusMonths);
	}
}
