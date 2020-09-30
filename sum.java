import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int counter = 1;
		int sum = 0;
		
		while(counter <= n) {
			
			sum = sum + counter;
			
			counter = counter +1;
		}
			System.out.println(sum);
		

	}

}

