package object;

public class Animal {

	String name = "ポチ";
	int age = 5;
	
	public Animal(){};
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void sleep() {
		System.out.println("眠った");
	}

}
