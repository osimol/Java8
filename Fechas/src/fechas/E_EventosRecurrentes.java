/**
 * Ejemplo de uso de la clase MonthDay, para representar eventos recurrentes de forma anual
 *
 */
package fechas;

import java.time.LocalDate;
import java.time.MonthDay;

public class E_EventosRecurrentes {

	public static void main(String[] args) {
		LocalDate nacimiento = LocalDate.of(1980, 11, 23);

		MonthDay diaMesNacimiento = MonthDay.of(nacimiento.getMonth(), nacimiento.getDayOfMonth());
		MonthDay diaMesHoy = MonthDay.from(LocalDate.now());
		if (diaMesHoy.equals(diaMesNacimiento)) {
			System.out.println("Muchas felicidades, porque es tu cumpleaños");
		} else {
			System.out.println("Lo siento, pero no es tu cumpleaños");
		}
	}

}
