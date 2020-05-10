package object;

public class Dog extends Animal{

	double weight = 12.3;

	public  Dog(){};
	public Dog(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public  void run() {
		System.out.println(this.name + "は走った");
	}
	//スリープメソッドをオーバーライド
	public  void sleep() {
		System.out.println(this.name + "は");
		super.sleep();
	}
}