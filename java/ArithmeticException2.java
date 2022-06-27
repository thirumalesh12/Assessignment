package excpetion;

class UnsupportedOperationException extends Exception{
	public UnsupportedOperationException(String message) {
		super(message);
	}
	public UnsupportedOperationException() {
		super("Number cannot be divided by zero");
	}
}
public class ArithmeticException2 {
	public static void main(String[] args) {
		int a=200,b=0;
		int c;
		try {
			c=(a/b);
		}
		catch (ArithmeticException e) {
			System.out.println("Invalid operation");
		}
	}

}
