package 可变参数;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hsfsaf");
		
		HspMethod hspMethod = new HspMethod();
		String str1 = hspMethod.showScore("zhangSan", 60,50,40);
		System.out.println(str1);
		
		String str2 = hspMethod.showScore("lisi", 60,50,40,30,20);
		System.out.println(str2);
	}

}
