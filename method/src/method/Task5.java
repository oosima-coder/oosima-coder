package method;

public class Task5 {
	public static void main(String[] args) {
		String []array1 = {"a","b", "c"};
		String []array2 = {"a", null, "c"};
  		String[] x  = nullCheck(array1);
  		boolean y  = nullCheck(array2);
  		System.out.println("---配列にnullがない場合---");
  		System.out.println(x);
  		System.out.println("---配列にnullがある場合---");
  		System.out.println(y);
  		if(nullCheck(x)) {

  		}
	}
	public static boolean nullCheck(String[] array){
		for(String num : array){
			if(num == null) {
				return true;
			}else {
				return false;
				}

}
}
}
