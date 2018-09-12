/**
 * Ejemplo de como testear si dos fechas son iguales
 *
 */
package fechas;

import java.time.LocalDate;

public class D_FechasIguales {

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		LocalDate fecha = LocalDate.of(1980, 11, 23);
		if (fecha.equals(hoy)) {
			System.out.printf("Hoy %s y la fecha %s son la misma fecha", hoy, fecha);
		} else {
			System.out.printf("Las fechas %s y %s NO son iguales", hoy, fecha);
		}
	}

}
