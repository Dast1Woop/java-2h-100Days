
public class Bird extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	private boolean canFly;
	
	private String singSoundString;
	
	
	void sing() {
		// TODO Auto-generated method stub
		System.out.println(singSoundString);
	}
	
	
	
	public Bird(String nameString, String typeString, boolean canFly, String singSoundString) {
		super(nameString,typeString,2);

		this.canFly = canFly;
		this.singSoundString = singSoundString;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String string = super.toString();
		return string + "," + singSoundString + "," + canFly;
	}
	
}
