
public class First_demo<T extends Number> {

	T[] num;//Declaring the object
	public First_demo(T[] o) {
		num=o;
		// TODO Auto-generated constructor stub
	}
	T[] getType(){
		
		return num;
	}
	double average(){
		double sum=0.0;
		for(int i=0; i<num.length; i++){
			sum+=num[i].doubleValue();
		}
		return sum/num.length;
	}
}
