package array;

import java.util.Random;

public class Task3 {

public static void main(String[] args) {
	int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
			System.out.print("[");
	Random r = new Random();
		int max = 0;
		int min = 100;

	for(int i = 0 ; i < 6 ; i++) {
		int num = nums[r.nextInt(10)];

		if(i == 5) {
			System.out.print(num);
		}else {
			System.out.print(num + ",");}
		
		max = Math.max(max, num);
		min = Math.min(min, num);
	}		System.out.println("]");
	
			System.out.println("最大値：" + max);
			System.out.println("最小値：" + min);

	}}
