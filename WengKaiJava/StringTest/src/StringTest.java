import java.util.Scanner;

public class StringTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string;
//		string = scanner.nextLine();
//		System.out.println(string);
//		
//		String string1;
//		string1 = scanner.next();
//		System.out.println(string1);
		
		//String 比较内容时，必须用 .equal，用法同 oc 的 isEqualToString
		String string20 = "hi";
//		String string20 = new String("hi");
		String string21 = "hi";
//		String string21 = new String("hi");
		System.out.println(string20 == string21);//都通过"hi"赋值时，结果为true，否则都为false！！！
		System.out.println(string20.equals(string21));//true
		
		string = scanner.next();
		System.out.println(string20 == string);//输入hi，此时为false
		System.out.println(string20.equals(string));//输入hi，此时为true
	}

}
