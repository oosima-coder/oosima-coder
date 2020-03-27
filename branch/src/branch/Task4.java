package branch;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
                            // TODO 自動生成されたメソッド・スタブ

    Scanner scan=new Scanner(System.in);

    System.out.println("数値を入力してください");

    int num1= scan.nextInt();
    int num2 =scan.nextInt();
                                                        
    	System.out.println("num1:"+num1);
    	System.out.println("num2:"+num2);
                                                        
        if(num1<=0||num2<=0){
        	System.out.println("正の数を入力してください");
        }
                                                        
        else if(num1%num2==0) {
                                                                      
        	System.out.println("num2はnum1の約数です");
        }
                                                        
        else if(num1%num2 !=0) {
                                                            
        	System.out.println("num2はnum1の約数ではありません");
        }
  
        scan.close();
              }
}
