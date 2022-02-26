package 二维数组;

public class 二维数组 {
	public static void main(String[] args) {
		System.out.println("test1");
		
//		test2();
	}
	
	static void test1() {
		int arr[][] = new int[3][];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = j + 1;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	static void test2() {
		int arr[][]={{4,6},{1,4,5,7},{-2}};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		
		System.out.println(sum);
		
	}
}
