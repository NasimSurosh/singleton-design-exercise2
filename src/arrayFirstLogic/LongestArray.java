package arrayFirstLogic;

public class LongestArray {

	public static void main(String[] args) {
		
		String[] words = {"apple", "strawberry", "grape", "grapefruit", "watermelon", "pineapple"};
		String longestString = findLongest(words);
		
		System.out.println("The content of arrays, strings are ");
		for (String arrayContent : words) {
			System.out.println(arrayContent);
		}
		
		System.out.println("The longest Strings are " +longestString);
	}
	public static String findLongest (String[] array) {
		int longest =  0;
		int element = array[0].length();
		for (int i = 1; i < array.length; i++) {
			if (array[i].length()> element) {
				longest = i;
				element = array[i].length();
			}
		}
		return array[longest];
		
	}
	
}
