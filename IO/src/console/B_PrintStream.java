/**
 * Example that captures the standard output into a file by reassigning the System.out stream to an output text file
 * Ejemplo que captura la salida estándar en un archivo reasignando la secuencia System.out a un archivo de texto de salida
 */

package console;

import java.io.PrintStream;

public class B_PrintStream {

	public static void main(String[] args) {
		try {
			PrintStream ps = new PrintStream("log.txt");
			System.setOut(ps);
			System.out.println("Test output to System.out");
		} catch (Exception ee) {
			ee.printStackTrace();
		}

	}

}
