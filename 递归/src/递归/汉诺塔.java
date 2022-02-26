package 递归;

public class 汉诺塔 {
	public static void main(String[] args) {
		move(22, 'a', 'b', 'c');
	}
	
	static void move(int plateNums, char aTower, char bTower, char cTower) {
		if (1 == plateNums) {
			System.out.println(aTower + "->" + cTower);
		}else {
			//上面所有盘 从 a 塔移到 b 塔（借助 c 塔）
			move(plateNums - 1, aTower, cTower, bTower);
			
			//底盘 从 a 塔 移到 c 塔
			System.out.println(aTower + "->" + cTower);
			
			//上面所有盘 从 b 塔移到 c 塔（借助 a 塔）
			move(plateNums - 1, bTower, aTower, cTower);
		}
	}
}
