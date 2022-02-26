
public class A0 {
	double max(double[] arr) {
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
