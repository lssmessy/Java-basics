import java.util.Scanner;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5, temp = 1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number you want:"+s);
		a=s.nextInt();
		
		for (int i = a; i > 0; i--) {
			temp *= i;
		}
		System.out.println("Factorial of " + a + " is " + temp);

	}

}
