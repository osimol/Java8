# Java 8 - Fechas

El API de fechas de Java 8 posee varias clases para manejarlas, pero la mayoría de ellas sigue esta convención 
sobre el nombre de los métodos que sirven para manejarlas.

El paquete **java.time package** contiene 4 subpaquetes:
- java.time.temporal : Accesses date/time fields and units
- java.time.format: Formats the input and output of date/time objects
- java.time.zone : Handles time zones
- java.time.chrono : Supports calendar systems such as Japanese and Thai calendars

## Clase LocalDate
java.time.LocalDate represents a date without time or time zone. LocalDate is represented in the
ISO-8601 calendar system in a year-month-day format (YYYY-MM-DD): for example, 2015-10-26.

## Clase LocalTime
The java.time.LocalTime class is similar to LocalDate except that LocalTime represents time without dates
or time zones. The time is in the ISO-8601 calendar system format: HH:MM:SS.nanosecond. Both LocalTime
and LocalDate use the system clock and the default time zone.

## Clase LocalDateTime
The class java.time.LocalDateTime represents both date and time without time zones. You can think of
LocalDateTime as a logical combination of the LocalTime and LocalDate classes. The date and time formats
use the ISO-8601 calendar system: YYYY-MM-DD HH:MM:SS.nanosecond.

## Clase **Period**
La clase java.time.Period se usa para medir una cantidad de tiempo en términos de años, meses y días.





| NOMBRE |	TIPO |	USO |
| ---------- | ---------- |---------- |
|of	|estático|	Crear una instancia del objeto a partir de los datos de entrada|
|from	|estático|	Convertir el parámetro de entrada en una instancia de la clase|
|parse	|estático|	Procesar la cadena de entrada y construir una instancia|
|format|	instancia|	Procesar los datos para producir una cadena de caracteres|
|get|	instancia|	Devolver una parte del objeto|
|is	|instancia|	Consultar el estado del objeto|
|with|	instancia|	Devolver una copia del objeto con uno o varios elementos modificados|
|plus|	instancia|	Devolver una copia del objeto con una cantidad de tiempo añadido|
|minus|	instancia|	Devolver una copia del objeto con una cantidad de tiempo sustraído|
|to	|instancia|	Convertir el objeto en otro Tipo|
|at|	instancia|	Combinar el objeto con otro objeto|