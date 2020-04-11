package calc;

public class Task2 {

	public static void main(String[] args) {
		int a = 10, b = 12, c = 13, d = 3;
		double e = 3.0;
		
		int num1 = a + b + c;
		int num2 = num1 / d;
		double num3 = num1 / e;
		
			System.out.print("合計:");
			System.out.println(num1);
			System.out.println("平均（3で割った時）:" + num2);
			System.out.println("平均(3.0で割った時):" + num3);
	}

}
