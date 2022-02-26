package 递归;

public class 走迷宫 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("迷宫：");
		
		/*创建迷宫 8行7列：m:mouse；e：exit
		 * 	*******
		 *  *m    *
		 *  *     *
		 *  ***   *
		 *  *     *
		 *  *     *
		 *  *    e*
		 *  *******
		 * */
		int row = 8,col = 7;
		int[][] arr = initArr(row, col);
		
		PrintArr printArr = new PrintArr();
		printArr.print2DimArr(arr);
		
		//老鼠走迷宫，输入：地图，老鼠坐标，输出：结果地图
		findWayA(arr, 1, 1);
		
		System.out.println("find way A:");
		printArr.print2DimArr(arr);
		
		arr = initArr(row, col);
		findWayB(arr, 1, 1);
		System.out.println("find way B:");
		printArr.print2DimArr(arr);
	}
	
	static int[][] initArr(int row,int col){
//		int row = 8,col = 7;
		int[][] arr = new int[row][col];
		for (int j = 0; j < col; j++) {
			arr[0][j] = 1;
			arr[row - 1][j] = 1;
		}
		
		for (int i = 0; i < row; i++) {
			arr[i][0] = 1;
			arr[i][col - 1] = 1;
		}
		
		arr[3][1] = 1;
		arr[3][2] = 1;
		
		arr[2][2] = 1;//测试回溯
		return arr;
	}
	
	/*
	 * 定义规则：
	 * * 0：可走位置 1：障碍物位置 2：可走的位置 3：尝试走过但是走不通的位置
	 * * 迷宫为8行7列，老鼠从（1，1）的位置开始走，当走到（6，5）的坐标时，认为走出了迷宫。
	 * * 策略A：下->右->上->左
	 * * 实现思路：递归的方式实现，假设当前位置可以走通，然后用某个策略的情况下，如果真能走通，假设成立，位置
	 * 标识为2，return true；如果走不通，位置标识为3，return false。回归到上一节点继续执行策略。
	 * */
	static boolean findWayA(int[][] map, int x, int y) {
//		if (x == 6 && y == 5) {
//			map[x][y] = 2;
//			return true;
//		}
		
		if (map[6][5] == 2) {
			return true;
		}
		
		if (map[x][y] == 0) {
			map[x][y] = 2;
			
			if (findWayA(map, x+1, y)) {
				return true;
			}else if (findWayA(map, x, y+1)) {
				return true;
			}else if (findWayA(map, x-1, y)) {
				return true;
			}else if (findWayA(map, x, y-1)) {
				return true;
			}else {//4个方向都走不通时，标记为3，return false
				map[x][y] = 3;
				return false;
			}
			
		}else {//1/2/3
			return false;
		}
	}
	
	 
	/*策略：右->下->左->上
	 * */
	static boolean findWayB(int[][] map, int x, int y) {
		if (x == 6 && y == 5) {
			map[x][y] = 2;
			return true;
		}
		
		if (map[x][y] == 0) {
			map[x][y] = 2;
			
			if (findWayB(map, x, y+1)) {
				return true;
			}else if (findWayB(map, x+1, y)) {
				return true;
			}else if (findWayB(map, x, y-1)) {
				return true;
			}else if (findWayB(map, x-1, y)) {
				return true;
			}else {//4个方向都走不通时，标记为3，return false
				map[x][y] = 3;
				return false;
			}
			
		}else {//1/2/3
			return false;
		}
	}
	

}
