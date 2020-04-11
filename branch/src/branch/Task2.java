package branch;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		System.out.println("数字を入力してください");

	int num1= scan.nextInt();
	if(num1>=10){
		System.out.println("値:"+num1);
		}
	else{
		System.out.println("値:0"+num1);
                            }
		scan.close();
}}
