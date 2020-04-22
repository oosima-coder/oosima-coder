package standardClass;

public class Task3 {

	public static void main(String[] args) {
		String text1[] = {"文", "字", "列", ": ", "A", "B", "C", "D", "E", "F", "G"};
		for(int x = 0; x < text1.length; x++) {
			if(x == text1.length-1) {
				System.out.println(text1[x]);
			}
				System.out.print(text1[x]);
		}
		for(int i = text1.length-1; i >= 0; i--) {
				System.out.print(text1[i]);
		}
	}
}
