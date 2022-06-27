package excpetion;

public class ArithmeticException1{
	public static void main(String[] args) {
		int a=0,b=20;
		int c;
		try {
			c=b/a;
		}
		catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println(e);
			System.out.println("Arithmetic Exception is Handled");
			
		}
	}

}
