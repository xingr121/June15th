package class7;

import java.util.Scanner;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int x = kb.nextInt();
        System.out.print("Input the second number: ");
        int y = kb.nextInt();
        System.out.print("Input the third number: ");
        int z = kb.nextInt();
        System.out.print("Check whether the three said numbers has a midpoint!");
        System.out.println(midPoint(x,y,z));
        
        kb.close();
	}
    public static boolean midPoint(int x, int y, int z) {
    	if (x + y == 2 * z || y + z == 2 * x || x + z == 2 * y) {
    		return true;
    	} else {
    		return false;
    	}
    }
	
}
