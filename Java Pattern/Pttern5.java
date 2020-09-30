package pattern;

import java.util.Scanner;

public class Pttern5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nsp = 0 ;
		int nst = n ;
		//row
		int row = 1;
		while(row <= n) {
			//space work
			int csp = 1;
			while(csp <= nsp) {
				System.out.print(" ");
				csp++ ;
			}
			int cst = 1;
			while(cst <= nst) {
				System.out.print("*");
				cst++ ;
			}
			//preparation
			System.out.println();
			nst = nst - 1;
			nsp = nsp + 1;
			row = row + 1;
		}
		
				
	}

}
