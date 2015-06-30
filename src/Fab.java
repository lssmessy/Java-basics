
public class Fab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int previous=0, result=0;
		int num=10; 
		for (int i = 0; i < num; i++) {
			if(i==0){
				System.out.println(""+previous);
				result=1;
			}
			else{
				int temp=(previous+result);
				System.out.println(""+temp);
				
				result=previous;
				previous=temp;
				
			}
			
		}

	}

}
