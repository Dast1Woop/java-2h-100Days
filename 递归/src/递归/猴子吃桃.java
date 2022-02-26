package 递归;

public class 猴子吃桃 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(taoziNumAt(1));
		
//		System.out.println(taoziNumAt(0));
		
		System.out.println(taoziNumAt(9));
	}
	
static int taoziNumAt(int day) {
	
	if (day > 10 || day < 1) {
		return -1;
	}
	
	if (day == 10) {
		System.out.println("第"+day+"天桃子数：1");
		return 1;
	}
	
	int num =  2*(taoziNumAt(day+1) + 1);
	System.out.println("第"+day+"天桃子数："+num);
	return num; 
}

}
