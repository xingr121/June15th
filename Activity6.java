package class7;

import java.util.Scanner;

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner kb = new Scanner(System.in);
		System.out.println("Input Side-1: ");
		double side1 = kb.nextDouble();
		System.out.println("Input Side-2: ");
		double side2 = kb.nextDouble();
		System.out.println("Input Side-3: ");
		double side3 = kb.nextDouble();
		
		double Area = triangleArea(side1, side2, side3);
		
		System.out.println("The area of the triangle is " + Area);
		
	}

	public static double triangleArea(double side1, double side2, double side3) {
		double p = (side1 + side2 + side3) / 2;
		double triangleArea = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		return triangleArea;
	}
}
