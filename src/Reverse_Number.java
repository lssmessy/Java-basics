public class Reverse_Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=130,sum=0;
		int j=0;
		int reverse=0;
		int temp=0;
		System.out.println("reverse from 100 to 200:");
		for(int i=100; i<=n; i++){
			j=i;
		while(j>0){
			
			temp=j%10;
			reverse=reverse*10+temp;
			j=j/10;
			
		}
		System.out.print(reverse+",");
		sum+=reverse;
		reverse=0;
		temp=0;
		}
		//System.out.println("Sum of reverse numbers is: "+sum);
		
		
		
	}

}
