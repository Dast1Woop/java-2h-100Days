import java.util.ArrayList;
import java.util.Iterator;

public class Zoo {

	ArrayList<Animal> gArrayList = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bird bird = new Bird("xique", "x", true, "guaguaguagu");
		System.out.println(bird);
		
		Dog taidiDog = new Dog("lele", "TaiDi", true);
		System.out.println(taidiDog);
		
		Zoo zoo = new Zoo();
		zoo.gArrayList.add(bird);
		zoo.gArrayList.add(taidiDog);
		System.out.println(zoo);
		
		for (Animal animal : zoo.gArrayList) {
			animal.yell();
		}
				

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return gArrayList.toString();
	}
	

}
 