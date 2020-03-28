package loop;
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);

	    	System.out.println("正の整数を入力してください");

	    int input1 = scanner.nextInt();

		for(int i = 1; i <= input1; i++) {
		if(input1 % i == 0) {
			System.out.println(input1+"の約数："+i);
		}


		}}}


