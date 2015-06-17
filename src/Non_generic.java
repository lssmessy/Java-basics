
public class Non_generic {
	Object ob;
	
	public Non_generic(Object o) {
		// TODO Auto-generated constructor stub
		ob=o;
	}
	Object getType(){
		return ob;
	}
	void showType(){
		System.out.println("Typf of object is :"+ob.getClass().getName());
	}

}
