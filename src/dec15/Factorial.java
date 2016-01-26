package dec15;

public class Factorial {
   public static void main(String[] args) {
	int sum=0,n=4550,r;
	while(n>=1){
		r=n%10;
		sum+=r;
		n=n/10;
	}
	System.out.println(sum);
}
}
