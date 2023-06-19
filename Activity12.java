package class7;

import java.util.Scanner;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
        System.out.print("Input an string:");
        String mys = kb.next();
        System.out.println(areVowels(mys));
		
	}

	public static boolean areVowels(String myString) {
		String myS = myString.toLowerCase();
		for (int i = 0; i < myS.length(); i++) {
			char ch = myS.charAt(i);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				return false;
			}
		}
		return true;
	}
}
