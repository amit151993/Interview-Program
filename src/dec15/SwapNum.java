package dec15;

public class SwapNum {
	static int temp, a = 10, b = 20;

	public static void main(String... args) {
		System.out.println("a=" + a + "; b=" + b);
		swap();
		
	}

	public static void swap() {
		temp = a;
		a = b;
		b = temp = b;
	}
}
