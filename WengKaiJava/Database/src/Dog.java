
public class Dog extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	private boolean hasCetification;
	
	public void yell() {
		// TODO Auto-generated method stub
		System.out.println("wangwang");

	}
	
	
	
	public Dog(String nameString, String typeString, boolean hasCetification) {
		super(nameString,typeString,4);
		
		this.hasCetification = hasCetification;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "," + hasCetification;
	}
	

}
