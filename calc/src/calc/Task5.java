package calc;
import java.util.Scanner;
public class Task5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String a="ノートpcの値段:", c="円";
		int b=89800;
		
		System.out.println(a+b+c);
		
				
		 //標準入力を取得
	    Scanner scanner = new Scanner(System.in);

	    //文字列入力
	    System.out.println("下に入力してください");

	    //２行を読み込んで返却
	    String input = scanner.nextLine();
	    String input2 =scanner.nextLine();

	    //上の二行を出力
	    System.out.println(input + input2);
	}

}
