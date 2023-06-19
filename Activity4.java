package class7;

import java.util.Scanner;

public class Activity4 {
	public static final int PASSWORD_LENGTH = 8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("A password must have at least ten characters.\n"
				+ "A password consists of only letters and digits.\n" + "A password must contain at least two digits.\n"
				+ "Expected Output:\n"
				+ "1. A password must have at least eight characters.                                             \n"
				+ "2. A password consists of only letters and digits.                                         \n"
				+ "3. A password must contain at least two digits                                        \n"
				+ "Input a password (You are agreeing to the above Terms and Conditions.): abcd1234           \n"
				+ "Password is valid: abcd1234 ");
		String pass = kb.next();
		boolean result = is_validPass(pass);
		if(result) {
			System.out.println("yes you got it");
		}else {
			System.out.println("Nope ");
		}

	}
	public static boolean is_validPass(String password) {
		if (password.length() < PASSWORD_LENGTH) {
			return false;
		}
		int charCount = 0 , numCount = 0;
		
		for(int i = 0 ; i < password.length();i++) { //p2argol
			char mych = password.charAt(i);
			
			if(is_Num(mych)) {
				numCount++;
			}else if(is_letter(mych)){
				charCount++;
			}else {
				return false;
			}
		}
		
		return(charCount >=2 && numCount>=2 );
	}

	public static boolean is_letter(char ch) {   
		ch = Character.toUpperCase(ch);
		if(ch>='A' && ch <='Z') {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean is_Num(char ch) {
		if(ch >='0' && ch <= '9') {
			return true;
		}else {
			return false;
		}
	}
}
