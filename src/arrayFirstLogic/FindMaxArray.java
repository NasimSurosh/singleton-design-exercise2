package arrayFirstLogic;

public class FindMaxArray {
	
	public static int minimumNumber (int[] arr) {
		int mini = arr[0];
		for (int i = 0; i < arr.length; i ++) {
			if (arr[i] < mini) {
				mini = arr[i];
			}
		}
		return mini;
	}
	public static int maximumNumber(int[] arr) {
		int maxi = arr[0];
		for (int i =  0 ; i < arr.length; i ++) {
			if (arr[i] > maxi) {
				maxi = arr[i];
			}
		}
		return maxi;
	}
	public static int calculate(int[] arr) {
		int sum = 0;
		for (int i = 0 ; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	

	public static void main(String[] args) {
		
		int[] numbers = {3, 34, 343, 45, 54, 54,467, 75};
		int avg = 0;
		
		
		minimumNumber(numbers);
		maximumNumber(numbers);
		calculate(numbers);
		avg = calculate(numbers)/numbers.length;
		System.out.println(calculate(numbers));
		System.out.println(minimumNumber(numbers));
		System.out.println(maximumNumber(numbers));
		System.out.println(avg);

	}

}
