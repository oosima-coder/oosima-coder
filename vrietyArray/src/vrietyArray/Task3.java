package vrietyArray;
import java.util.HashMap;
public class Task3 {

	public static void main(String[] args) {
		HashMap<String, Integer> items = new HashMap<>() ;
		items.put("りんご",130);
		items.put("みかん",120);
		items.put("バナナ",98);
		items.put("メロン",6000);
		
		for(HashMap.Entry<String, Integer>price : items.entrySet()) {
		System.out.print(price.getKey());
		System.out.print(":");
		System.out.print(price.getValue());
		System.out.println("円");
		}
	}

}
