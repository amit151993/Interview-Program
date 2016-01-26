package dec15;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a=scan.nextInt();
		int temp=a;
		while(temp>=2){
			temp=temp-2;
		}
		if (temp==1){
			System.out.println("number is odd");
		}
		else{
			
		
			System.out.println("Number is even");

	}}

}
