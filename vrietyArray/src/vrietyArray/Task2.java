package vrietyArray;
import java.util.ArrayList;
public class Task2 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		int[] array = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60};
		
		ArrayList<Integer> oddNum = new ArrayList<>();
		ArrayList<Integer> evenNum = new ArrayList<>();
		for(Integer num1  : array) {
		if(num1 % 2 != 0) {
			
			oddNum.add(num1);
		
		}else {
			evenNum.add(num1);
		}
		}	
			System.out.println("奇数: " + oddNum);
			System.out.println("偶数: " + evenNum);
	}
}