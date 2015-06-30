
public class Fib {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=0;
		int prev=0;
		
		int number=10;
		for (int i = 0; i < number; i++) {
			if (i==0) {
				System.out.println(""+value);
				value=1;
			} else {
				int temp=(value+prev);
				
				System.out.println(""+(temp));
				value=prev;
				prev=(temp);
				
			}
		}
	}

}
