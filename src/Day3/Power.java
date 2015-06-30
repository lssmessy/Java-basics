package Day3;

import java.util.Scanner;

public class Power {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		System.out.println("Enter its power: ");
		int n=s.nextInt();
		
		System.out.print("Result is :"+pow(x,n));
	}
	public static int pow(int x, int n){
		int temp=1;
		int first=x;
		
		while(temp!=n){
			x=x*first;
			temp++;
			
		}
		if(temp==n)
		{
			temp=x;
		}
			
			return temp;
		}
	

}
