/**
 * Ejemplo de como obtener, por separado, las cifras correspondientes al día, mes y año.
 */

package fechas;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;

public class A_FechaHoy {

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		System.out.println("La fecha actual es : " + hoy);
		
		LocalDate fechaCienDias = LocalDate.ofYearDay(2018,100);
		System.out.println("La fecha actual es : " + fechaCienDias);
		
		LocalDate fechaClock = LocalDate.now(Clock.systemDefaultZone());
		System.out.println("La fecha actual es : " + fechaClock);
		
		LocalDate fechaZone = LocalDate.now(ZoneId.of("Asia/Anadyr"));
		System.out.println("La fecha actual es : " + fechaZone);
		
		LocalDate fechaZone2 =LocalDate.now(ZoneId.of("Pacific/Pago_Pago"));
		System.out.println("La fecha actual es : " + fechaZone2);
		
	}

}
