package Display;

public class Dispaly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private int value = 0;
	private int limit = 0;
	
	public Dispaly(int limit){
		this.limit = limit;
	}
	
	public int getValue() {
		return value;
	}
	
	
	public void increase() {
		value += 1;
		if (value == limit) {
			value = 0;
		}
	}
	

}
