package branch;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
          
		System.out.println("10以上の数値を入力して下さい");
		Scanner scanner = new Scanner(System.in);
                            
		int number1 = scanner.nextInt();
                      
		if(number1 < 10) {
			number1 = number1 * 10;
			System.out.println("値：" + number1);
		}
		scanner.close();
	}
}
