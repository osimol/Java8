/**
 * Ejemplo de como a�adir horas a una hora en particular
 */
package fechas;

import java.time.LocalTime;

public class G_AniadirHoras {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		LocalTime newTime = time.plusHours(2); // a�adiendo dos horas 
		System.out.println("Hora, despu�s de 2 horas : " + newTime);
		
	}
}
