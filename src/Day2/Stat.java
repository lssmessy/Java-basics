package Day2;

public class Stat<T extends Number> {
	T[] nums;
	
	public Stat(T[] ob) {
		nums=ob;
		
	}
	
	double average(){
		double sum=0.0;
		for(int i=0; i<nums.length; i++){
			sum+=nums[i].doubleValue();
		}
		return sum/nums.length;
				
	}
	boolean sameAvg(Stat<?> obj){//Here the invoking object type is unknown. 
		//It may be Integer or Double but it can be compared during runtime by specifying wildcard boundry(?)
		return average()==obj.average()? true : false;
		
		
	}

}
