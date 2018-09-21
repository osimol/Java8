/**
 * Ejemplo de como obtener una fecha concreta a partir de su día, mes y año.
 */
package fechas;

import java.time.LocalDate;
import java.time.Month;

public class C_FechaConcreta {

	public static void main(String[] args) {
		LocalDate fecha = LocalDate.of(1980, 11, 23);
		System.out.printf("Tu fecha de nacimiento es %s \n",fecha);
		
		// El segundo argumento, java.time.Month, es un enumerado que representa los 12 mese
		LocalDate valentinesDay = LocalDate.of(2016, Month.FEBRUARY, 14);
		System.out.printf("Valentine's day is on: %s \n",valentinesDay);
	}

}
