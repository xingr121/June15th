package class7;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int count = 0;
		for (int i = 1; i <= 50; i++) {
    	  System.out.printf("%-6d", getPentagonalNumber(i));
    	  count++;
    	  if (count % 10 == 0) {
    		  System.out.println();
    	  }
      }
		
	}

	public static int getPentagonalNumber(int n) {
		return n * (3 * n - 1) / 2;
	}
}
