package pattern;

import java.util.Scanner;

public class Patternwhileloop {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int row = 1;
		while (row <= n) {
			//work
			int col = 1;
			while (col <= n) {
				System.out.print("*");
				col = col + 1;
			}
			//preparation
			System.out.println();
			row = row + 1;
		}

	}

}
