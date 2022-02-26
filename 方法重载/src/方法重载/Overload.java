package 方法重载;

import java.security.AccessControlContext;

public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods methods = new Methods();
		int r1 = methods.m(2);
		int r2 = methods.m(4, 5);
		
		System.out.println(r1);
		System.out.println(r2);
		methods.m("hello a");
	}

}
