package arrayFirstLogic;

public class SumeOfIntArray {

	public static void main(String[] args) {
		
		int[] number = {16, 8, 23, 35, 11, 6, 19};
		int calculate = 0;
		int minimum = number[0];
		int maximum = number[0];
		double avg = 0;
		
		for (int i = 0; i < number.length; i++) {
			calculate = calculate + number[i];
			if (number[i] < minimum) minimum = number[i];
			if (number[i] > maximum) maximum = number[i];
			avg = calculate/number.length;
		}
		System.out.println("The minimum value is (" + minimum + ") The maximum value is (" + maximum + ") Sum of given numbers is (" + calculate + ")");
		System.out.println("The average is " + avg);
	}
	
}
