package branch;
import java.util.Scanner;

public class Task1 {

              public static void main(String[] args) {
                            // TODO 自動生成されたメソッド・スタブ

                            System.out.println("10以上の数値を入力して下さい");
                            
                            
                            Scanner scan=new Scanner(System.in);
                            
                            int number1= scan.nextInt();
                            
                            if (number1>=10)
                                          System.out.println("値："+number1);
                            
                            if(number1<10)
                                          System.out.println("値:"+number1*10)
                                          ;
              }

}

