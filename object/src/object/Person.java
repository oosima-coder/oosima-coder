package object;

public class Person {
	private String name;
	private int age;
	static int wallet;
	Person(){
		String name;
		int age;
	}
	Person(int wallet){
		System.out.println(wallet);
	}

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getInt() {
		return this.age;
	}
	public void setInt(int age) {
		this.age = age;
	}

	public  void myProfile(){
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("私の年齢は" + this.age + "です。");
		System.out.println("よろしくお願いします。");
	}
}
