package branch;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		 //標準入力を取得
	    Scanner scanner = new Scanner(System.in);

	    //数字入力
	    System.out.println("１から５までの数字を入力してください");

	    //５行
	    int input1 = scanner.nextInt();
	  
	    
	    switch(input1) {
	    	case 1:
	    		System.out.println("1->I");
	    		break;
	    case 2:
    		System.out.println("2->II");
    		break;
	    case 3:
    		System.out.println("3->III");
    		break;
	    case 4:
			System.out.println("4->IV");
			break;
	    case 5:
			System.out.println("5->V");
			break;
		default:
			System.out.println("unknown");
			break;
	    }
	    

	    
			
	}

}
