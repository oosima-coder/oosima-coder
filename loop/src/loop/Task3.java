package loop;
import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    	System.out.print("数字を入力してください: ");

	    int sum1 = scanner.nextInt();
	    	System.out.print("桁数: " + String.valueOf(sum1).length());
	    	scanner.close();
	}

}