package vrietyArray;

import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList<>();
		languages.add("北海道");
		languages.add("東北");
		languages.add("関東");
		languages.add("中部");
		languages.add("近畿");
		languages.add("中国");
		languages.add("九州");
		
		for(String language : languages) {
			System.out.println(language);
		}
	}

}
