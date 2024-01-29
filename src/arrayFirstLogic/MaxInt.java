package arrayFirstLogic;

public class MaxInt {

	public static void main(String[] args) {

		int[] score = { 61, 53, 43, 42, 14, 25, 33 };
		int heighstScore = maximum(score);
		
		System.out.println(heighstScore);

	}

	public static int maximum(int[] number) {

		int max = number[0];
		for (int num : number) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

}
