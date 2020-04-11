package vrietyArray;
import java.util.ArrayList;
import java.util.HashMap;
public class Task4 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		int[] array = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60, 29, 5, 46, 74, 14, 193, 215, 83};
		
		ArrayList<Integer> oddNum = new ArrayList<>();
		ArrayList<Integer> evenNum = new ArrayList<>();
			for(Integer num1  : array) {
				if(num1 % 2 != 0) {
				
				oddNum.add(num1);
			
				}else {
				evenNum.add(num1);
				}
			}	
		HashMap<String, ArrayList<Integer>> label = new HashMap<>();
		label.put("奇数",oddNum);
		label.put("偶数",evenNum);
				
		System.out.println(label);
	}
}
