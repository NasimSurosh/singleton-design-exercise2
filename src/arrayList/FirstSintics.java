package arrayList;

import java.util.ArrayList;

public class FirstSintics {

	public static void main(String[] args) {
		
		// arraylist works as object    primitive data type works as Integer or String 
		
		ArrayList<Integer> list = new ArrayList<>();
		
		// these items are indexed just like in array
		list.add(8);                 // add(element);
		list.add(7);
		list.add(76);
		list.add(876);
		
		
		/*System.out.println(list.get(0));   // get(index)
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		list.remove(876);    // remove index
		list.clear();       //  to clear all the list
		*/
		
		// if we to print everything we dont use the uper method
		
		
		// printing all elements of the arraylist
		for(Integer n : list ) {
			System.out.println(n);
		}
		System.out.println();

		for (int i = 0; i < list.size(); i ++) {
			Integer n = list.get(i);
			System.out.println(i + " : " + n);
		}
	}

}
