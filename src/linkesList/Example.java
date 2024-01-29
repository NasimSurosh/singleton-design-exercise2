package linkesList;

import java.util.LinkedList;

public class Example {
	double balance = 0.0;
	

	public static void main(String[] args) {
		
		LinkedList<Double> account = new LinkedList<>();
		
		addAccount(1000.0);
		addAccount(1500.0);
		addAccount(500.0);
		
		
		

	}
	public static void addAccount(double amount) {
		double balance = 0.0;
		balance =balance + amount;
		System.out.println(balance);
	}
	public double displayBalance() {
		return balance;
	}

}
