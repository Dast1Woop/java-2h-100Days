import java.util.Iterator;
import java.util.Scanner;

public class NormalSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		
		String[] names = {"张三", "李四","王二"};
		Scanner scanner  = new Scanner(System.in);

		while(true) {
			int index = -1;
			
			System.out.println("input name pls:");
			String inputString = scanner.next();
			for (int i = 0; i < names.length; i++) {
				if(names[i].equals(inputString)) {
					index = i;
					break;
				}
			}
			
			if (index == -1) {
				System.out.println("not found");
			}else {
				System.out.println("found!index:" + index);
			}
		}
		
	}

}
