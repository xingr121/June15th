package class7;

import java.util.Scanner;

public class Activity61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a Java method to find if given number from user is prime or not.
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Input a number: ");
		int num = kb.nextInt();
		if (isPrime(num)) {
			System.out.println(num + " is prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	 kb.close();
	}
   public static boolean isPrime(int n) {
	   if (n < 2) {
		   return false;
	   }
	   for(int i = 2; i <= n/2; i++) {
		   if ((n % i)==0) {
			   return false;
		   }  
	   }
	   return true;
   }
}
