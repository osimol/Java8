/**
 * Ejemplo de como crear una tipo enumerado.
 */

package enumdata;

//define an enum for classifying printer types
enum PrinterType {
	DOTMATRIX, INKJET, LASER
}

public class A_Nuevo {

	PrinterType printerType;

	public A_Nuevo(PrinterType pType) {
		printerType = pType;
	}

	public void feature() {
		// switch based on the printer type passed in the constructor
		switch (printerType) {
		case DOTMATRIX:
			System.out.println("Dot-matrix printers are economical and almost obsolete");
			break;
		case INKJET:
			System.out.println("Inkjet printers provide decent quality prints");
			break;
		case LASER:
			System.out.println("Laser printers provide best quality prints");
			break;
		}
	}

	public static void main(String[] args) {
		A_Nuevo enumTest = new A_Nuevo(PrinterType.LASER);
		enumTest.feature();
	}

}
