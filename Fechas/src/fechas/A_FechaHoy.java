/**
 * Ejemplo de como obtener, por separado, las cifras correspondientes al d�a, mes y a�o.
 */

package fechas;

import java.time.LocalDate;

public class A_FechaHoy {

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		System.out.println("La fecha actual es : " + hoy);
	}

}
