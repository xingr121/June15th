package class7;

import java.util.Scanner;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int x = kb.nextInt();
        System.out.print("Input the second number: ");
        int y = kb.nextInt();
        System.out.print("Input the third number: ");
        int z = kb.nextInt();
        System.out.print("Check whether the three said numbers are consecutive or not!");
        System.out.println(areConsecutive(x,y,z));
        
        kb.close();
	}

	public static boolean areConsecutive(int x, int y, int z){
	    int max_num = Math.max(x, Math.max(y, z));
	    int min_num = Math.min(x, Math.min(y, z));
	    int middle_num = x+y+z - max_num - min_num;
	    return (max_num - middle_num) == 1 && (middle_num - min_num == 1);
	  }
}
