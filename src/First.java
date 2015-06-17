
public class First {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		First_demo<Integer> ob;
		Integer nums[]={3,6,4,2,56};
		//First_demo<Integer> ob;
		ob=new First_demo<Integer>(nums);
		
		double db=ob.average();
		System.out.println("average is :"+db);
		
		Double db2[]={4.3,5.4,3.8,4.5,6.4};
		First_demo<Number> ob2=new First_demo<Number>(db2);
		double av=ob2.average();
		System.out.println("Average of double: "+av);
		/*First_demo<String> ob1;
		ob1=new First_demo<String>("This is the world");
		ob1.showType();
		String s=ob1.getType();
		System.out.println("value: "+s);*/
		
		
		
		
	}

}
