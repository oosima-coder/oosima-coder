package loop;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("数字を入力してください: ");
	    int input1 = scanner.nextInt();
	    int sum = 1;
	    System.out.print(1);
	    for(int i = 1; i <= input1; i++) {
	    	System.out.print(" + " + i);
	    	sum += i;
	    }
	    System.out.println(" = " + sum);
	    scanner.close();
	}
	
}