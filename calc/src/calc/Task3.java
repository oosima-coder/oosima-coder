package calc;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		 //標準入力を取得
	    Scanner scanner = new Scanner(System.in);

	    //数字入力
	    System.out.println("下に数字を入力してください");

	    //３行を読み込んで返却
	    int input1 = scanner.nextInt();
	    int input2 = scanner.nextInt();
	    int input3 = scanner.nextInt();

	    //合計
	    System.out.println("合計:"+(input1+input2+input3));
	    
	    int input4=input1+input2+input3;
	    System.out.println("平均(3で割ったとき):"+(input4/3));
	    
	    System.out.println("平均(3.0で割ったとき):"+(input4/3.0));
	    		
			
	}

}
