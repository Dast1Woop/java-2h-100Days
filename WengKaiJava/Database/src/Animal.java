import javax.net.ssl.SSLEngine;

public class Animal {
	

	private String nameString;
	private String typeString;
	private int legsNum;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public void  yell() {
		System.out.println("yell");
	}
	
	
	
	public Animal(String nameString, String typeString, int legsNum) {
		super();
		this.nameString = nameString;
		this.typeString = typeString;
		this.legsNum = legsNum;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nameString + "," + typeString + "," + legsNum;
	}

}
