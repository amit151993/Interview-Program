package dec15;

public class WithOutSort {

	public static void main(String[] args) {
		int a[] = new int[] { 4, 2, 8, 3, 7, -22, 11 };
		WithOutSort t = new WithOutSort();
		int b[] = t.sorttoArray(a);
		for(int n=0;n<b.length;n++){
			System.out.print(" "+b[n]);
			
		}
	}

	public int[] sorttoArray(int[] a) {
		int temp;
		int len = a.length;
		for(int i=0;i<len-1;i++){
			for(int j=0;j<len-1;j++){
				if(a[j]>a[j+1]){
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}

}
