package loop;
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);

	    	System.out.print("正の整数を入力してください: ");

	    int input1 = scanner.nextInt();
	    	System.out.print(input1+"の約数：");
		for(int i = 1; i < input1; i++) {
		if(input1 % i == 0) {
			System.out.print(i + ",");
		}
		}	System.out.print(input1);
	}
}