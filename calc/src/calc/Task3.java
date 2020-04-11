package calc;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);

	    int input1 = scanner.nextInt();
	    int input2 = scanner.nextInt();
	    int input3 = scanner.nextInt();
	    int num1 = input1+input2+input3;
	    
	    	System.out.println("合計:" + num1);
	    
	    int num2 = num1 / 3;
	    double num3 = num1 / 3.0;
	    	System.out.println("平均(3で割ったとき):"+(num2));
	    
	    	System.out.println("平均(3.0で割ったとき):"+(num3));
	    		
			scanner.close();
	}}