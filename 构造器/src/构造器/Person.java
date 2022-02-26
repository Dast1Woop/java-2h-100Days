package 构造器;

public class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person(String nameString){
		name = nameString;
	}
	
	Person(){
		age = 18;
	}
}
