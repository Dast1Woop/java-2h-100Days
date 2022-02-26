
public class Func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("hi");
//		myFunc();
		
		String aString = "a", bString = "b";
		swap(aString, bString);
		
		System.out.println(aString + bString);
		
		int a = 1, b = 2;
		swapInt(a, b);
		System.out.println(a);
		System.out.println(b);
		
		if (a== 1) {
//			int a = 5;
		}
	}
	
	static void myFunc() {
		System.out.println("my func");
	}
	
	static void swap(String aString, String bString) {
		String cString = aString;
		aString = bString;
		bString = cString;
	}
	
	static void swapInt(int aString, int bString) {
		int cString = aString;
		aString = bString;
		bString = cString;
	}
	

}
