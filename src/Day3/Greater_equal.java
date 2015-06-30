package Day3;

public class Greater_equal {

	public static void main(String[] args) {

		int a[] = { 5, 10, 15, 20, 25 };
		int n = 25, count = 0, sum = 0, l = 1;
		int len = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (j != a.length) {
					sum = a[i] + a[j];
					System.out.println(a[i] + " +" + a[j] + "=" + sum);
					if ((a[j] + a[j]) >= n) {
						count++;
						sum = 0;
					}
				}

			}
			System.out.println("=====");
		}
		System.out.println("Count for >=25 is :" + count);

	}

}
