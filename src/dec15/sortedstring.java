package dec15;

import java.util.Arrays;

public class sortedstring {

	public static void main(String[] args) {
		String st="vhfuwgiwh";
		char[] a=st.toCharArray();
		Arrays.sort(a);
		String sorted=new String(a);
		System.out.println(sorted);

	}

}
