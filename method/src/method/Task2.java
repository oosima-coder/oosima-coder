
package method;

public class Task2 {

	public static void main(String[] args) {
		double test = getTriangleArea(2, 2);
		System.out.println("三角形の面積");
		System.out.println(test);

	}
	public static double getTriangleArea(double num1, double high) {
		return Math.round(num1 * high / 2);
	}

}
