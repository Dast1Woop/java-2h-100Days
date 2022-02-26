package 递归;

public class PrintArr {
	void print2DimArr(int[][] arr2Dim) {
		for (int i = 0; i < arr2Dim.length; i++) {
			for (int j = 0; j < arr2Dim[i].length; j++) {
				System.out.print(arr2Dim[i][j]);
			}
			
			System.out.println();
		}
	}
}
