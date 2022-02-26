package 可变参数;

public class HspMethod {
	String showScore(String name,double...scores) {
		double score = 0.0;
		for (int i = 0; i < scores.length; i++) {
			score += scores[i];
		}
		return name + "有" + scores.length + "门课，总分为：" + score;
	}
}
