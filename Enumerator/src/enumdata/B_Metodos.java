/**
 * Ejemplo de como crear una tipo enumerado.
 */

package enumdata;

//define an enum for classifying printer types
enum Printer {
	DOTMATRIX(5), INKJET(10), LASER(50);
	private int pagePrintCapacity;

	private Printer(int pagePrintCapacity) {
		this.pagePrintCapacity = pagePrintCapacity;
	}

	public int getPrintPageCapacity() {
		return pagePrintCapacity;
	}
}

public class B_Metodos {

	Printer printerType;

	public B_Metodos(Printer pType) {
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
		System.out.println("Print page capacity per minute: " +
				printerType.getPrintPageCapacity());
	}

	public static void main(String[] args) {
		B_Metodos enumTest1 = new B_Metodos(Printer.LASER);
		enumTest1.feature();
		B_Metodos enumTest2 = new B_Metodos(Printer.INKJET);
		enumTest2.feature();
	}

}
