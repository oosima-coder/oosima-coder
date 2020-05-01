package branch;
import java.util.Scanner;
public class Task6 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("1から5までの数字を入力してください");
	    int input1 = scanner.nextInt();
	    String name = "";
	    switch(input1) {
	    	case 1:
	    		name = "Ⅰ";
	    		break;
	    	case 2:
	    		name = "Ⅱ";
	    		break;
	    	case 3:
	    		name = "Ⅲ";
	    		break;
	    	case 4:
	    		name = "Ⅳ";
	    		break;
	    	case 5:
	    		name = "Ⅴ";
	    		break;
	    	default:
	    		name = "unknown";
				break;
	    }
	    System.out.println(input1 + " -> " + name);
	    scanner.close();
	}
}
