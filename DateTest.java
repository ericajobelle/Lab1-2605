import java.util.Map;
import java.util.TreeMap;

public class DateTest {

	public static void main(String[] args) {
		Date d1 = new Date(9, 10, 2002);
		Date d2 = new Date(8, 20, 2020);
		Date d3 = new Date(4, 16, 2005);
		Date d4 = new Date(3, 24, 2010);
		
		
	//Problem 3
		TreeMap<Date, String> syllabus = new TreeMap(); // use compare to as basis
		syllabus.put(d1, "java");
		syllabus.put(d2, "python");
		syllabus.put(d3, "c++");
		syllabus.put(d4, "java Script");
		
		 for(Map.Entry<Date, String> topic: syllabus.entrySet()) {
			if(topic.getKey().month == 9 && topic.getKey().year == 2002) {
				System.out.println(topic.getValue());
			}else {
				System.out.println(topic.getValue() + " does not fall in September 2001");
			}
			//System.out.println(topic.getKey() + "," + topic.getValue());
		} 
		
	//Problem 2	
		if (d1.compareTo(d2) == 1) {
			System.out.println(d1 + " is latter than " + d2);
		
		}else if (d1.compareTo(d2) == -1 ) {
			System.out.println(d1 + " is earlier than " + d2);
		
		}else {
			System.out.println(d1 + " and " + d2 + " are the same dates...");
			
		}  
	

	}

}
