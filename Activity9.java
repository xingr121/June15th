package class7;

import java.util.Scanner;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java method for extracting the first digit from a positive or negative integer. 
		
		Scanner kb = new Scanner(System.in);
        System.out.print("Input an integer(positive/negative):");
        int n = kb.nextInt();
        System.out.println("Extract the first digit from the said integer:");
        int firstDigit = extractFirstDigit(n);
        System.out.println(firstDigit);
	}
   public static int extractFirstDigit(int n) {
	   int num = 10;
	   while (n / num != 0) {
		   num *= 10;
	   }
	   num = num / 10;
	   return Math.abs(n) / num;

	}

}
