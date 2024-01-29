package arrayCostomObject;

import java.util.ArrayList;

public class CarMain {

	
	public static void main(String[] args) {
		
		ArrayList<Car> cars  = new ArrayList<>();
		
		cars.add(new Car ("vokswagen"));
		cars.add(new Car ("BMW"));
		cars.add(new Car ("volvo"));
		
		
		cars.set(1, new Car ("Porscha"));
		
		for (Car auto : cars) {
			System.out.println(auto);
		}

	}

}
