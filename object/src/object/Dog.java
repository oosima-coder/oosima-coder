package object;

public class Dog extends Animal{

	double weight = 12.3;
	
	public  Dog(){};
		public Dog(String name, int age, double weight) {
	
			this.weight = weight;
		}
		
		public static void run(String name) {
			System.out.println(name + "は走った");
		}
		public static void sleep(String name) {
			System.out.println(name + "は眠った");
		}
		
		public static void main(String[] args) {
			Dog dog = new Dog();
			System.out.println("名前 : " + dog.name);
			System.out.println("年齢 : " + dog.age + "歳");
			System.out.println("体重 : " + dog.weight + "kg");
			run(dog.name);
			dog.sleep();
			sleep(dog.name);
			
		}
}
