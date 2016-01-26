package dec15;

public class Print1to10withoutUsingLoop {
	public static void main(String[] args) {
count(2);
	}

	public static void count(int i) {
		if(i<=10){
			System.out.print(i);
			count(i+1);
		}
	}
}
