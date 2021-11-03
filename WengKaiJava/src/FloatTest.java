import java.util.Scanner;

public class FloatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("111");
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input 英尺、英寸：");
		int inch, foot;
		inch = in.nextInt();
		foot = in.nextInt();
		
		double temp = inch + /*居然可以行内注释*/foot/12.0;
		System.out.println(temp);
		double cm = (temp)*0.3048;
		System.out.println(inch + "尺" + foot  + "寸，" +"对应cm：" + cm);
		
		}
	

}
