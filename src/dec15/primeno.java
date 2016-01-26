package dec15;

import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = scan.nextInt();
		for (int i = 1; i < a; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {

					System.out.println("not a prime number");
					prime = false;
					break;
				}

			}
			if (prime ) {
				System.out.println(i+" ");
				
			}

		}

	}
}
