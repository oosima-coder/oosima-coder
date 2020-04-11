package branch;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int numA = scan.nextInt();
    int numB = scan.nextInt();
                                                        
    	System.out.println("numA:"+numA);
    	System.out.println("numB:"+numB);
                                                        
        if(numA <= 0 || numB <= 0){
        	System.out.println("正の数を入力してください");
        }
                                                        
        else if(numA % numB == 0) {
                                                                      
        	System.out.println("numBはnumAの約数です");
        }
                                                        
        else if(numA % numB != 0) {
                                                            
        	System.out.println("numBはnumAの約数ではありません");
        }
  
        scan.close();
              }
}
