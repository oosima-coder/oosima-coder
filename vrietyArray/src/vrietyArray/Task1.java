package vrietyArray;

import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {
		ArrayList<String> lands = new ArrayList<>();
		lands.add("北海道");
		lands.add("東北");
		lands.add("関東");
		lands.add("中部");
		lands.add("近畿");
		lands.add("中国");
		lands.add("九州");
		
		for(String land : lands) {
			System.out.println(land);
		}
	}

}
