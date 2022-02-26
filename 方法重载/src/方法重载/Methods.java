package 方法重载;

public class Methods {
	int m(int num) {
		return num * num;
	}
	
	int m(int m1, int m2) {
		return m1 * m2;
	}
	
	void m(String str) {
		System.out.println(str);
	}
}
