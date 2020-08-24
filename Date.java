import java.util.Date;

public class Date implements Comparable{
	int month;
	int day;
	int year;
	
	Date(int m, int d, int y){
		this.month = m;
		this.day = d;
		this.year = y;
	}

	@Override
	public int compareTo(Object arg0) {
		Date other = (Date) arg0;
		if(this.year > other.year) {
			return 1;
		}else if (this.year < other.year) {
			return -1;
		}else { // meaning same year
			if (this.month > other.month) {
				return 1;
			}else if (this.month < other.month){
				return -1;
			}else {
				if (this.day > other.day) {
					return 1;
				}else if(this.day < other.day) {
					return -1;
				}else {
					return 0;
				}
			}
		}
	
	}

	@Override
	public String toString() {
		return "" + this.month + "/" + this.day + "/" + this.year; 
	}
	
	
}
