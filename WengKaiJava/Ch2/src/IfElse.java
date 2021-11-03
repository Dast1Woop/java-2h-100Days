import java.util.Random;
import java.util.Scanner;

public class IfElse {

	public static int numberCountOfInt(int number) {
		int count = 0;
		int temp = number;
		
		do {
			temp /= 10;
			count += 1;
		}while(temp != 0);
		
		return count;
	}
	
	public static int guessNumCounts(int desti) {
		int count = 0;
		Scanner in = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("input a number:");
			count += 1;
			int num = in.nextInt();
			
			if(num == desti) {
				System.out.println("Guess right!");
				return count;
			}
			
			if(num > desti){
				System.out.println("guess smaller!");	
			}else {
				System.out.println("guess bigger!");
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		
//		while(true) {
//			Scanner in = new Scanner(System.in);
//			System.out.println("input a number:");
//			int num = in.nextInt();
//			int res = numberCountOfInt(num);
//			System.out.println("res=" + res);
//		}
		
		//[0,1) -> [0,100) -> [1,100]
		int desti = (int)(Math.random()*100 + 1);
		int guessCount = guessNumCounts(desti);
		System.out.println("guessCount=" + guessCount);
	}
	
	
	
	

}
