package fechas;

import java.time.LocalDate;

public class B_DiaMesAnio {

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		int year = hoy.getYear();
		int month = hoy.getMonthValue();
		int day = hoy.getDayOfMonth();
		System.out.printf("Año : %d Mes : %d Día : %d \t %n", year, month, day);
	}

}
