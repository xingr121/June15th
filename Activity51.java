package class7;

import java.util.Scanner;

public class Activity51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java method to create a pentagon's area.
		Scanner kb = new Scanner(System.in);
		System.out.println("Input the number of sides: ");
		int numOfSide = kb.nextInt();
		System.out.println("input the side: ");
		double side = kb.nextDouble();
		double area = areaOfPentagon(side);
		System.out.println("The area of the pentagon is  " + area);
	}
    public static double areaOfPentagon(double side) {
    	return (5 * side * side) / (4 * Math.tan(Math.PI / 5));
    }
}
