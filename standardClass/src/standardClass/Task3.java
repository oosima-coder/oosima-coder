package standardClass;

public class Task3 {

	public static void main(String[] args) {
		String text1 = ("文字列: ABCDEFG");
		System.out.println(text1);
		for(int i = text1.length()-1; i >= 0; i--) {
				System.out.print(text1.charAt(i));
		}
	}
}
