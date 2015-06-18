package Day2;

public class StatDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i[]={2,3,4,5,6};
		Stat<Integer> intAvg=new Stat<Integer>(i);
		double iav=intAvg.average();
		System.out.println("Integer avg is :"+iav);
		
		
		Double db[]={2.0,3.0,4.0,5.0,6.0};
		Stat<Double> dbAvg=new Stat<Double>(db);
		double dbav=dbAvg.average();
		
		System.out.println("Double avg is :"+dbav);
		String ab= intAvg.sameAvg(dbAvg)? "same" :"Different";
		System.out.println("Both averages are "+ab); 
		/*if(intAvg.sameAvg(dbAvg)){
			System.out.println("Both averages are same");
		}
		else{
			System.out.println("Both averages are Different");
		}
		*/
		
	}

}
