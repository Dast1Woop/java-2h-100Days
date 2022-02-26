package 构造器;

public class Main {
	public static void main(String[] args) {
		Person person = new Person("lilei", 19);
//		Person person = new Person();
		System.out.println(person.name + person.age);
		
		Person person2 = new Person("hanmm");
		System.out.println(person2.name);
		
		Person person3 = new Person();
		System.out.println(person3.age);
	}
}
