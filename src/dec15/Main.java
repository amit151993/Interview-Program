package dec15;
import java.util.Scanner;

public  class Main{

public static void main(String[] args) {
	/*Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Number: ");
	int t1=scan.nextInt();
	int n,res;
	boolean flag=true;
	for(int i=2;i<=t1/2;i++){
		res=t1%2;
		if(res==0){
			flag=false;
			break;
		}
	}
		if(flag){
			System.out.println("prime number");
		}
		else{
			System.out.println("not prime number");
		}*/
	//.......============================================//
		/*int j,sum=0;
		for(j=0;j<=10;j++){
			System.out.print(" "+j*j);
			sum+=j*j;
		}
		System.out.println(sum);*/
		//====================================================//
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Number: ");
	int n=scan.nextInt();
	int prod=1;
	for(int i=n;i>=1;i--){
		prod*=i;
	}
	System.out.println(prod);
	}
//==============================================================//
}
    
