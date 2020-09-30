import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int divisor = 2 ;
		boolean flag = true;
		
		while (divisor <= n-1) {
			
			if(n % divisor == 0) {
				flag =false;	
			}
			divisor = divisor + 1;
		}
		if (flag == true) {
			System.out.println("prime");	
		}else {
			System.out.println("non prime");
		}

	}

}
