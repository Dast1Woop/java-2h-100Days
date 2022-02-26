public class AA{
	 boolean judgeIsOdd(int num) {
		 if (num%2 == 0) {
			return false;
		}
		 return true;
	 }
	 
	 void print(int row,int col,char str) {
			for (int i = 0; i < row; i++) {
				
				for (int j = 0; j < col; j++) {
					System.out.print(str);
				}
				
				System.out.println();
			}
		}
}
