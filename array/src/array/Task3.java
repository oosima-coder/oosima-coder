package array;

import java.util.Random;
public class Task3 {

	public static void main(String[] args) {
		int[] nums = new int[6];
		int max = 0;
		int min = 100;
		Random r = new Random();
		System.out.print("[");
		for(int i = 0; i <  nums.length; i++){
			nums[i] = r.nextInt(10);
		}
		for(int i = 0; i < nums.length; i++) {
			if(i == nums.length) {
				System.out.print(nums[i]);
			}else {
				System.out.print(nums[i] + ",");
			}
			if(nums[i] > max) {
				max = nums[i];
			}
			if(nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.println("]");
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
	}
}