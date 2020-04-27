package standardClass;
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		String text1 = "ABCDGOPQRSYZ";
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.nextLine();
		System.out.println("探したい文字: " + input1);
		if(text1.indexOf(input1) >= 0) {
			System.out.println("ABCDGOPQRSYZは" + input1 + "を含む");
		}else {
			System.out.println("ABCDGOPQRSYZは" + input1 + "を含まない");
		}
		scanner.close();
	}
}
