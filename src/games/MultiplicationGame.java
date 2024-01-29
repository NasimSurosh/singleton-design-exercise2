package games;

import java.util.Random;
import java.util.Scanner;

public class MultiplicationGame {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random number = new Random();
		
		
		
		int chanceToPlay = 1;
		int result = 0;
		int user = 0;
		int correctAnswer = 0;
		int incorrectAnswer = 0;
		
		while (chanceToPlay <= 11) {
			int randomNumber = number.nextInt(11);
	    	int randomNumber1 = number.nextInt(11);
			System.out.println("Game nomber : " + chanceToPlay);
			result = randomNumber * randomNumber1;
			System.out.println(randomNumber + " * " + randomNumber);
			user = scan.nextInt();
			if (user == result) {
				System.out.println(result);
				System.out.print("Thats correct answer! you win ");
				correctAnswer ++;
				break;
			}
			else {
				System.out.println("result is "+ result +" Please try another one ");
				incorrectAnswer ++;
			}
			chanceToPlay ++;
		}
		scan.close();

	}

}
