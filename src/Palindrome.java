
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4000,sum=0;
		for(int i=1000; i<n; i++){
			int num=i;
			int temp=0,reverse=0;
			while(num>0){
				temp=num%10;
				num=num/10;
				reverse=reverse*10+temp;
				
			}
			if(reverse==i){
				System.out.println("palindrome is :"+i);
				sum++;
			}
			
			temp=reverse=0;
		}
		System.out.println("Total palndromes are: "+sum);

	}

}
