import java.util.Scanner;

public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20; // 0,1,1,2,3,5,8,13,21
		int z = 0, one = 1,count=0;
		int temp = 0, i = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number you want:" + s);
		n = s.nextInt();
		while (i < n) {
			if (i == 0) {
				one = 0;
				temp = z + one;
				System.out.print(temp + ",");
				i++;
				count++;
			} else if (i == 1) {
				one = 1;
				temp = z + one;
				System.out.print(temp + ",");
				i++;
				count++;
			} else {

				temp = z + one;
				System.out.print(temp + ",");
				z = one;
				one = temp;
				i++;
				count++;
			}
		}
		System.out.println("Count is: "+count);

	}

}
