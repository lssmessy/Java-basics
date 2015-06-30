package Day3;

import java.util.ArrayList;

public class Perfect_Number {

	/*
	 * Perfect number is a number whose factors(excluding original number)
	 * addition is same number ie, 6 have factors 1,2,3 and their addition is 6.
	 * so , 6 is perfect number
	 */

	public static void main(String[] args) {
		int n = 1000, num = 0, i = 1, j = 0, temp = 0, sum = 0;

		for (int p = 1; p < n; p++) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			while (i != p) {
				temp = p % i;
				if (temp == 0) {
					a.add(j, i);
					j++;
				}
				i++;
			}
			for (int k = 0; k < a.size(); k++) {
				sum = sum + a.get(k);

			}
			if (sum == p) {
				System.out.println("====  ===== Its a perfect number " + p);

			}

			i = 1;
			j = temp = sum = 0;

		}
	}

}
