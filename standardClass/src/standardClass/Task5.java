package standardClass;
public class Task5 {
	public static void main(String[] args) {
		String str = "cat_mouse_mouse_cat_cat";
		String [] aray1 = str.split("_");
		int cntCat = 0;
		int cntMouse = 0;
		for(String text1 : aray1) {
			if(text1.equals("cat")) {
				cntCat++;
			}
			else{
				cntMouse++;
			}
		}
		if(cntCat > cntMouse) {
			System.out.println("catの方が多い");
		}else {
			System.out.println("mouseの方が多い");
		}
 	}
}
