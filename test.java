//最简单的程序，完成 1+1；体会
public class test {
	public static void main(String[] args) {
		int res = 1 + 1;
		System.out.println("res = " + res);

		int a = 10;

		//int 与字符串相邻时，+ 的结果是字符串。+ 的结合性是左结合，从左往右结合。
		System.out.println(10 + 3);//13
		System.out.println(10 + "3");//103
		System.out.println(10 + 1 + "3");//113
		System.out.println(10 + "3" + 1);//1031
		System.out.println("3" + 10 + 1);//3101
	}
}