package hw8;

class PrintException extends Exception {
}

class PaperPrintException extends PrintException {
}

public interface Q18 {
	abstract int printData() throws PrintException;
}
