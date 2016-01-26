package dec15;

import java.util.Scanner;

public class PrimeNumbe {
private static Scanner scan;
	public static void main(String args[]) {
		int n, i, res;
		boolean flag = true;
		 scan = new Scanner(System.in);
		System.out.println("Please Enter a No.");
		n = scan.nextInt();
		for (i = 2; i <= n ; i++) {
			res = n % i;
			if (res == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println(n + " is Prime Number");
		else
			System.out.println(n + " is not Prime Number");
	}
}
