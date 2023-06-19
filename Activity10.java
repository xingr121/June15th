package class7;

import java.util.Scanner;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
        System.out.print("Input an integer(positive/negative):");
        int n = kb.nextInt();
        System.out.println("Factors of 3 of the said integer:");
        factorOf3(n);
	}

	public static void factorOf3(int n) {
		System.out.print(n + " = ");
		int res = n;
		while (res % 3 == 0)  {
			System.out.print("3 * ");
			res = res / 3;
		}
		System.out.print(res);
	}
}
