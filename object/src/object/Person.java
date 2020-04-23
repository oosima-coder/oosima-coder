package object;

public class Person {
	static int wallet;
		Person(int wallet){
			System.out.println(wallet);
	}
	
	private String name = "";
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	private int age = 0;
	public int getInt() {
		return this.age;
	}
	public void setInt(int age) {
		this.age = age;
	}
		Person(){
		String name;
		int age;
	}
	public  void myProfile(){
	System.out.println("私の名前は" + this.name + "です。");
	System.out.println("私の年齢は" + this.age + "です。");
	System.out.println("よろしくお願いします。");

	}
}
