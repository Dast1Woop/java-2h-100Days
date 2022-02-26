
public class Main {
	public static void main(String[] args) {
		
		//不行！
//		double resDouble = max2({1.0, 5.0, 0.1, 4.0});
		
		//可以！
		double[] arr = {1.0, 5.0, 0.1, 4.0};
		double resDouble = max2(arr);
		
		System.out.println(resDouble);
	}
	
	static double max2(double[] arr) {
		double max = 0;
		for (int i = 0; i < arr.length; i++) {
			double num = arr[i];
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
}
