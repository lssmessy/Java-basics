public class Armstrong_Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000, temp = 0, armstrong = 0, i = 0;
		for (int j = 100; j <= n; j++) {
			i = j;
			while (i > 0) {
				temp = i % 10;
				armstrong += temp * temp * temp;
				i = i / 10;
			}
			if (armstrong == j) {
				System.out.println("Armstrong number is " + armstrong);
			}
			temp = armstrong = i = 0;

		}
	}

}
