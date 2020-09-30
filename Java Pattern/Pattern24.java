package pattern;

import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int nst = 1;
		int nsp = n - 1;
		int val;
		//row
		int row = 1;
		while( row <= n) {
			val = row;
			
			//spaces
			for(int csp = 1 ; csp <= nsp; csp++) {
				System.out.print(" ");
			}
			//star
			for(int cst = 1 ; cst <= nst; cst++) {
				System.out.print(val);
		    }
			//prep
			System.out.println();
			nsp--;
			nst +=2;
			row++;
			
		}
	}

}
