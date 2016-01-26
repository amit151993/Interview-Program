package dec15;

public class primenumber {

	public static void main(String[] args) {
		int num=15;
		boolean a=true;
		for(int i=2;i<=num/2;i++){
			if (num%i==0){
				System.out.println("number is not prime");
				a=false;
				break;
			}
		}
		if (a==true){
			System.out.println("number is prime number");
		}
	}

}
