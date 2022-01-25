
public class ByteOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		
		System.out.println(2&3);
		
/** 结论：负数通过补码或原码算数值的结果是一样的！
 * 2的补码为 00000000 00000000 00000000 00000010
 * ~2补码为  11111111 11111111 11111111 11111101
 * 首位为1，代表是负数。其真实值很难一眼看出，按位计算也比较麻烦：1*2^(32-1)+1*2^(31-1)+...+0+1*2^0 = ...
 * 技巧：转为原码，方便算出（原码首位1只表示负数，没有权重）
 * 负数的补码 = 负数反码 + 1；负数反码 = 负数补码 - 1；反码和原码通过 符号位外 的逐位取反实现
 * ~2的反码 = 补码 - 1，即： 11111111 11111111 11111111 11111100
 * =》 ~2的原码为 10000000 00000000 00000000 00000011,可看出，原码对应的数值为 -3
 * 小结：负数通过补码或原码算数值的结果是一样的。eg：4位原码1001，代表 -1，其补码为 1110+1 = 1111，对应数值
 * 为 -1 * 2^(4-1)+2^(3-1)+2^(2-1)+2^(1-1) = -8 + 4 + 2 + 1 = -1
 */
		System.out.println(~2);
		
		System.out.println(2|3);
		
		System.out.println(2^3);
		
		yiweiTest();
		
		quyuTest();
	}
	
	static void yiweiTest() {
		int a = 1 >> 2;
		int b = -1 >> 2;//-1,解析：-1的4位原码 1001，补码1111，右移2位后：1111，不变，还是-1
		int c = 1 << 2;
		int d = -1 << 2;//-4
		int e = 3>>>2;//0
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d); 
		System.out.println(e);
	}
	
	static void quyuTest() {
		
		/*
		 * a%b = +a-(int)a/b*b（口诀：加减除乘，先a后b,2a取整）;-10.5%3 = -10.5-(-10)/3*3=-10.5+9 = -1.5
		 * */
		double a = -10.5%3;
		System.out.println(a);
	}

}
