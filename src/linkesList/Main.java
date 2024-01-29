package linkesList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		/*
		   - ArrayList uses an array to store its elements, while LinkedList stores its
		   - element in a double-list. - ArrayList is used more in reading scenarios. -
		   - LinkedList is used more to data addition or deletion. - LinkedList and
		   - ArrayList are two different implementation of the list Interface.
		  
		   - most common methods of LinkedList
		  
		  get(index);
		  add(element);
		  add(index, element);
		  addFirst(Element);  and addLast(element);
		  getFirst() and getLast();
		  remote(index);
		  removeFirst(); and removeLast();
		  clear();
		  
		 */

		LinkedList<String> list = new LinkedList<>();

		list.add("Item 1"); // Add element
		list.add("Item 2");
		list.add("Item 3");
	

		for (String li : list) {
			System.out.println(li);
		}
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			String l = list.get(i);
			System.out.println(i + " : " + l);
		}
	
		List<Integer> number1 = new LinkedList<>();
		
		number1.add(54);
		number1.add(45);
		number1.add(78);
		
		showList(number1);
		
	}
	public static void showList(List<Integer> list) {
		for(Integer num : list) {
			System.out.println(num);
		}
	}

}
