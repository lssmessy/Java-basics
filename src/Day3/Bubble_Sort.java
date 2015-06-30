package Day3;

public class Bubble_Sort {
	
/*	This sorting method will take one element and will try to match with all other elements of the array, If any found element
	is less than current element then their places are swapped and sorting is formed
	1) algorithm BubbleSort(list)
2) Pre: list != 0
3) Post: list has been sorted into values of ascending order
4) for i <- 0 to list.Count - 1
5) for j <- 0 to list.Count - 1
6) if list[i] < list[j]
7) Swap(list[i], list[j])
8) end if
9) end for
10) end for
11) return list
12) end BubbleSort
*/

	/*This program takes one array, sort it in ascending order and remove the repeated number from the list*/
	
	public static void main(String[] args) {
		int a[]={45,67,34,56,12,34,57,43,23,10,67,10,78,45,34};
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		int b=a[0];
		boolean match=false;
		int count=0;
		for (int i = 0; i < a.length; i++) {
					
			if(a[i]==b & match==false){
				match=true;
				count++;
			}else if(a[i]!=b){
				System.out.println(""+a[i]);
				b=a[i];
				match=false;
			}
			
		}
		System.out.println("Repearted digits are "+count);

	}

}
