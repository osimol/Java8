/**
 * Ejemplo de como obtener una fecha concreta a partir de su d�a, mes y a�o.
 */
package fechas;

import java.time.LocalDate;

public class C_FechaConcreta {

	public static void main(String[] args) {
		LocalDate fecha = LocalDate.of(1980, 11, 23);
		System.out.printf("Tu fecha de nacimiento es %s",fecha);
	}

}
