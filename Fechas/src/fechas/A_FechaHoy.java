package fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class A_FechaHoy {

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		System.out.println("La fecha actual es : " + hoy);
		
		LocalDateTime fechaHora = LocalDateTime.now();
		System.out.println("La fecha y hora actual es : " + fechaHora);
	}

}
