package dec15;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		int temp=n;
		while(temp!=0){
			int r=temp%10;
		    sum=sum+r*r*r;
		    temp=temp/10;
		}
		if (n==sum){
			
			System.out.println("number is armstrong "+n);
			
		}
		else{
			System.out.println("number is not armstrong: "+n);
		}
	}
	
}
