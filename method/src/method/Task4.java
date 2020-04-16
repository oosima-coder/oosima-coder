package method;

import java.util.Arrays;
public class Task4 {
	public static void main(String[] args) {
		String []array1 = {"a","b", "c"};
		String []array2 = {"a", null, "c"};
  		boolean x  = nullCheck(array1);
  		boolean y  = nullCheck(array2);
  		System.out.println("---配列にnullがない場合---");
  		System.out.println(x);
  		System.out.println("---配列にnullがある場合---");
  		System.out.println(y);
	}
	public static boolean nullCheck(String[] array){
			if(Arrays.asList(array).contains(null)) {
				return true;
			}else {
				return false;
			}
	}
}
