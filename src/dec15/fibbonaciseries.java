package dec15;

public class fibbonaciseries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
   for (int i =0;i<=20;i++){
	   int sum=a+b;
	   a=b;
	   b=sum;
	   System.out.println(sum);
   }
   
	}

}
