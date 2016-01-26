package dec15;

public class ContConstructor {
	static int count = 0;

	ContConstructor() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		ContConstructor t = new ContConstructor();
		ContConstructor t1 = new ContConstructor();
		ContConstructor t11 = new ContConstructor();
		ContConstructor t111 = new ContConstructor();
		ContConstructor t1111 = new ContConstructor();
		System.out.println("no of constructor called is: " + count);
	}
}
