package loop;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);

	    //入力
	    	System.out.println("数値を入力してください");

	    int input1 = scanner.nextInt();

		int sum = 0;
		for(int i = 1; i <= input1; i++) {
			sum += i;
		}
			System.out.println("1～"+input1+"までの合計："+sum);

	}

}
