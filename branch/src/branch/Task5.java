package branch;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
                            // TODO 自動生成されたメソッド・スタブ

		Scanner scan=new Scanner(System.in);

		System.out.println("数値を入力してください");

		int num1= scan.nextInt();
		int num2 =scan.nextInt();
		int num3 =scan.nextInt();

		if(num1>=num2) {
		if(num1>=num3){
                                                                                    
			System.out.println("最大値は"+num1);                                                                
                                                                                    
                                                                      }
                                                        }
                                                        
                                                        
                                                        
		else if(num2>=num1) {
		if(num2>=num3) {
                                                                                    
			System.out.println("最大値は"+num2);
                                                                                    
                                                                      }
                                          
                                                        }

		else if(num3>=num1) {
		if(num3>=num2) {
                                                                                    
			System.out.println("最大値は"+num3);
                                                                      }
                                                        }
                                                        
                                          
        scan.close();

                            
              }

}

