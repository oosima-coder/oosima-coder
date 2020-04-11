package branch;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
    int number1 =  scan.nextInt();
                            
    if (number1 > 0) {
    	System.out.println("入力された数字は正の数です。");}
                            
    else if(number1 < 0) {
        System.out.println("入力された数字は負の数です。");
                            }
    else {
    	System.out.println("入力された数字は0です。");
                  }
    	scan.close();
    }}
