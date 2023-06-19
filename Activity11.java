package class7;

import java.util.Scanner;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
        System.out.print("Input an integer:");
        int n = kb.nextInt();
        System.out.println(isDigitEven(n));
		
	}

	public static boolean isDigitEven(int n) {
		
		int positiveNum = Math.abs(n);
				while (positiveNum > 0) {
					int digit = positiveNum % 10;
					if (digit % 2 != 0) {
						return false;
					}
				    positiveNum = positiveNum /10;
				}
					return true;
				}

}
