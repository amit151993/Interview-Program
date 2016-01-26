package dec15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		int arr[] = { 12, 45, 2, 3, 3, 4, 45, 3, 45 };
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		Iterator it = set.iterator();
		while(it.hasNext()) {
		  System.out.println(it.next());
		}
	}

}
