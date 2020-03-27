package branch;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		 //標準入力を取得
	    Scanner scanner = new Scanner(System.in);

	    //入力
	    System.out.println("病院に行く曜日を選択してください");
	    System.out.println("【日曜、月曜、火曜、水曜、木曜、金曜、土曜】");

	    
	    String input1 = scanner.next();
	  
	    
	    switch(input1) {
	    	case "月曜":
	    		System.out.println("午前診療と午後診療があります");
	    		break;
	    	case "火曜":
	    		System.out.println("午前診療と午後診療があります");
	    		break;
	    	case "水曜":
	    		System.out.println("午前診療と午後診療があります");
	    		break;
	    	case "木曜":
	    		System.out.println("午前診療と午後診療があります");
	    		break;
	    	case "金曜":
	    		System.out.println("午前診療と午後診療があります");
	    		break;
	    	case "土曜":
	    		System.out.println("土曜は午前診療のみです");
	    		break;
	    	case "日曜":
	    		System.out.println("日曜は休診です");
	    		break;
	    	default:
	    		System.out.println("入力を確認してください");
	    		
	    	
	    
	    }
	    

	    
			
	}

}