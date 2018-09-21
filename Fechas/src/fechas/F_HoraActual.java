/**
 * Ejemplo de como obtener la hora actual, incluidos hasta los nanosegundos
 *
 */
package fechas;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;

public class F_HoraActual {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println("La hora actual es : " + time);
		
		LocalTime horaMin = LocalTime.of(18,30);
		System.out.println("La hora definida es : " + horaMin);
		
		LocalTime horaMinSec = LocalTime.of(18,30,34);
		System.out.println("La hora definida es : " + horaMinSec);
		
		System.out.println(LocalTime.now(Clock.systemDefaultZone()));
		// returns current time as 18:30:35.744
		System.out.println(LocalTime.now(ZoneId.of("Asia/Tokyo")));
		// returns current time as 22:00:35.193
		
		System.out.println(LocalTime.ofSecondOfDay(66620));
		// returns 18:30:20 because 66620 seconds have elapsed
		
	}

}
