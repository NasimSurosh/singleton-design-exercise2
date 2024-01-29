package assignment;

public class FirstAssignment {

	public static void main(String[] args) {
		
		int[][] numbers = {{9, 14, 67, 344, 76},{56,45,34, 65, 45}};
		
		int sum = 0;

		for (int i = 0; i < numbers.length; i ++) {
			for (int j = 0 ; j < numbers[i].length; j++) {
				sum = sum + numbers[i][j];
				
			}
			System.out.println(sum);
			
		}
	}

}
