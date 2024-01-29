package games;

import java.util.Random;
import java.util.Scanner;

public class ChosingNumberGame {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int number = rand.nextInt(100) + 1;
		System.out.println("the random number is: " + number);
		System.out.println("Please enter a number from (1) to (100) : ");
		

		while (true) {
			
			int user = scan.nextInt();
			if (number == user) {
				System.out.println("Congratulatuin you win! ");
				break;
			} else if (user > number) {
				System.out.println("You entered heigher number try agin ");
			} else {
				System.out.println("You entered lower number try agin");
			}
		}
		scan.close();
	}

}
