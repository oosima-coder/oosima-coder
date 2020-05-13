package array;

public class Task3 {

	public static void main(String[] args) {
		int[] nums = new int[6];
		int max = 0;
		int min = 100;
		System.out.print("[");
		for(int i = 0; i <  nums.length; i++){
			nums[i] = new java.util.Random().nextInt(10);
		}
		for(int i = 0; i < nums.length; i++) {
			if(i == 5) {
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