package branch;
import java.util.Scanner;
public class Task5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		int numA = scan.nextInt();
		int numB = scan.nextInt();
		int numC = scan.nextInt();
		System.out.println("numA:" + numA);
		System.out.println("numB:" + numB);
		System.out.println("numC:" + numC);
	
			if(numA >= numB && numA >= numC) {
				System.out.println("最大値:" + numA);
			}else if(numB >= numA && numB >= numC){
				System.out.println("最大値:" + numB);
			}else {
				System.out.println("最大値:" + numC);
			}
        scan.close();
	}
}
