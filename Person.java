

// public 主类名 必须与 文件名 一致！
public class Person{

	/**doc test*/
	public void test(){
		System.out.println("test");
	}

	public static void main(String[] args) {
		// System.out.println("hello world1!");

		// boolean isPass = true;
		// if (isPass) {
		// 	System.out.println("pass");
		// }else{
		// 	System.out.println("not pass");
		// }

		int i = (int)1.9;
		System.out.println("i=" + i);

		int j = 100;
		byte m = (byte)j;
		System.out.println("m=" + m);		
	}
}

/*
test1
*/

/** test2
*/

//java一个文件里只能有一个 public 类！
//javac Person后，可以通过 java Dog，执行 Dog 的 main 函数
// public 
/**dddd, dog*/
class Dog{
	public static void main(String[] args) {
		System.out.println("wang wang");
	}
}