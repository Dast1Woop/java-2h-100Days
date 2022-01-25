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
		System.out.println("test1");
		
//		while(true) {
//			Scanner in = new Scanner(System.in);
//			System.out.println("input a number:");
//			int num = in.nextInt();
//			int res = numberCountOfInt(num);
//			System.out.println("res=" + res);
//		}
		
		//[0,1) -> [0,100) -> [1,100]
		
//		int desti = (int)(Math.random()*100 + 1);
//		int guessCount = guessNumCounts(desti);
//		System.out.println("guessCount=" + guessCount);
		
		double res = calculateAvg();
		System.out.println("avg=" + res);
	}
	
	
	static double calculateAvg() {
		int sum = 0;
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int num = scan.nextInt();
			if(num == -1) {
				return 0 == count ? 0 : (double)sum/count;
			}
			
			sum += num;
			count += 1;
		}
	}
	

}
