/**
 * Ejemplos para parsear, formatear fechas. Transformacion de fecha String a LocalDate
 */
package fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;

public class N_ParseFormat {
	public static void main(String[] args) {
		// Imprimimos formateando la misma a un formato LARGO
		LocalDate hoy = LocalDate.now();
		System.out.println(hoy.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));

		try {
			String diaDespuesDeHoy = "20171112";
			LocalDate formateada = LocalDate.parse(diaDespuesDeHoy, DateTimeFormatter.BASIC_ISO_DATE);
			System.out.printf("La fecha generada de un String %s es %s %n", diaDespuesDeHoy, formateada);

			String viernes = "18/04/2014";
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate holiday = LocalDate.parse(viernes, formatter);
			System.out.printf("Cadena formateada correctamente %s, la fecha es %s%n", viernes, holiday);

			String otraFecha = "20171112";
			DateTimeFormatter formatterDif = DateTimeFormatter.ofPattern("yyyyMMdd");
			LocalDate fecha = LocalDate.parse(otraFecha, formatterDif);
			System.out.printf("Cadena formateada correctamente %s, la fecha es %s%n", diaDespuesDeHoy, fecha);
		} catch (DateTimeParseException ex) {
			ex.printStackTrace();
		}

	}
}
