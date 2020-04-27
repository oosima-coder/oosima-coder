package loop;
import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("数字を入力してください: ");

	    int sum1 = scanner.nextInt();
	    int num1 = 0;
	    while(sum1 > 0) {
	    	num1++;
	    	sum1 = sum1 / 10;
	    }
	    	System.out.println("桁数: " + num1);
	    	scanner.close();
	}
}