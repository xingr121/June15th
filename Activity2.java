package class7;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);

        System.out.print("Input the investment amount: ");
        double invAmount = kb.nextDouble();

        System.out.print("Input the rate of interest: ");
        double interestRate = kb.nextDouble();

        System.out.print("Input number of years: ");
        int numberOfYear = kb.nextInt();
        
        System.out.println("Years    FutureValue");
        
        for (int i = 1; i <= numberOfYear; i++) {
        	System.out.printf("%d%17.2f", i, futureInve(invAmount, interestRate, i));
        	System.out.println();
	}
        kb.close();
	}

	public static double futureInve(double investmentAmount, double rateOfInterest, int numOfYear)  {
		
		double futureValue = investmentAmount * Math.pow(1 + rateOfInterest / 100, numOfYear);
		return futureValue;
	}
}
