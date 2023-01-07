package 捕获异常; import java.io.StringBufferInputStream;

public class TryCatch {
	
	String[] strings = new String[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("kjk");
		
		TryCatch tryCatch = new TryCatch();
		tryCatch.a();
		
	}
	
	
	 void a() {
		
		 try {
			 g();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("a:" + e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		 
		 System.out.println("h end");
	}
	 
	 void g() {
			h();
		}
	 
	 void h() {
			try {
				 System.out.println(strings[10]);	
				 System.out.println("h try 000");
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("H:" + e);
				throw e;
				
			}
		}

}
