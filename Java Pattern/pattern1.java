package pattern;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int row=1 ; row <= n ; row++) {
			//work
			System.out.println("*");
			//preparation
			System.out.print("\n");
		}
	}

}
