package pattern;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		
		int nr = 2 * n - 1;
		int nst = 1;
		//row
		int row = 1;
		while(row <= nr) {
			
			//work
			int cst = 1;
			while(cst <= nst) {
				System.out.print("*");
				cst++;
			}
			//prep
			System.out.println();
			if (row <= nr / 2) {
				nst = nst + 1;
			}else {
				nst = nst - 1;
			}
			row = row + 1;
		}
		
	}

}
