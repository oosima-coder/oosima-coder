package calc;
import java.util.Scanner;
public class Task5 {

	public static void main(String[] args) {
		
		String price1 = "ノートPCの値段:";
		char price2 = '円';
		int num = 89800;
		
		System.out.println(price1 + num + price2);

	    Scanner scanner = new Scanner(System.in);

	    String input = scanner.nextLine();
	    String input2 =scanner.nextLine();

	    //上の二行を出力
	    System.out.println(input);
	    System.out.println(input2);
	    System.out.println(input + input2);
	    scanner.close();
	}
}
