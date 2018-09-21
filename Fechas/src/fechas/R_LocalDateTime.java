/**
 * Ejemplo de uso de ChronoUnit.{unit}.between para averiguar la diferencia entre las fechas
 */

package fechas;

import java.time.LocalDateTime;

public class R_LocalDateTime {
	public static void main(String[] args) {
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("Today's date and current time is: " + currDateTime);
		
		LocalDateTime christmas = LocalDateTime.of(2015, 12, 25, 0, 0);
		LocalDateTime newYear = LocalDateTime.of(2016, 1, 1, 0, 0);
		System.out.println("New Year 2016 comes after Christmas 2015? "+newYear.isAfter(christmas));
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Today's date and current time: " + dateTime);
		System.out.println("The date component is: " + dateTime.toLocalDate());
		System.out.println("The time component is: " + dateTime.toLocalTime());

	}
}
