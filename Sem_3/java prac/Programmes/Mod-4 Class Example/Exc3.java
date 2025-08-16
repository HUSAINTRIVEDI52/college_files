//multiple catch block

public class Exc3 {
	public static void main(String args[]) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 10;
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Array index out of bound");
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception held");
		} catch (Exception e) // to handle any type of Exception
		{
			System.out.println(e);
		}
		System.out.println("rest of the code...");
	}
}