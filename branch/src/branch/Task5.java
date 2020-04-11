package branch;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("数値を入力してください");

		int numA = scan.nextInt();
		int numB = scan.nextInt();
		int numC = scan.nextInt();
		
		int array[] = {numA, numB, numC};

		int max = 0;
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("numA:" + numA);
		System.out.println("numB:" + numB);
		System.out.println("numC:" + numC);
		System.out.println("最大値:" + max);
        scan.close();
}}
