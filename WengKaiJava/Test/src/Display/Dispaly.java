package Display;

public class Dispaly {

	
	private int value = 0;
	private int limit = 0;
	
	private static int step = 1;
	
	public Dispaly(int limit){
		this.limit = limit;
	}
	
	public int getValue() {
		return value;
	}
	
	
	public void increase() {
		value += 1;
		if (value == limit) {
			value = 0;
		}
	}
	
	public static void f() {
		System.out.println(step);
	}
	
	
// 自动提示加上下面语法，使对象使用类属性时，不显示警告。java 居然可以这么访问，奇怪！
//	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Dispaly d1 = new Dispaly(10);
		Dispaly d2 = new Dispaly(20);
		System.out.println(d1.step);
		System.out.println(d2.step);
		
		d1.step = 2;
		System.out.println(d1.step);
		System.out.println(d2.step);
		
		f();
	
		Dispaly.step = 3;
		System.out.println(Dispaly.step);
		
		f();
	}

}
