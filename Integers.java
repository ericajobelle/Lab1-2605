import java.util.ArrayList;

public class Integers {
	ArrayList<Integers> nums = new ArrayList(); 
	
	static int computeSum(ArrayList<Integer> ints) {
		int sum = 0; 
		for(int num: ints) { //iterate
			sum += num;
		}
		return sum;
	}
}

//Problem 1