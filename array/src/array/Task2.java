package array;

public class Task2 {
	public static void main(String[] args) {
		int[] array =  {7, 6, 5, 4, 3, 2, 1};
		for(int i = 0; i < array.length; i++) {
			if(i == array.length-1) {
				System.out.println(array[i]);
			}else {
				System.out.print(array[i] + ",");
			}
		}		

		for (int i = array.length-1; i >= 0; i--) {
			if(i == 0) {
				System.out.println(array[i]);
			}else {
				System.out.print(array[i] + "," );
			}
		}
	}
}