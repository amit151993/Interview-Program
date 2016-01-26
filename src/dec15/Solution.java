package dec15;
import java.util.Scanner;

/*import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
         * Enter your code here. Read input from STDIN.
         * Print output to STDOUT.
         * Your class should be named Solution.
         
        int x = 0;
        double y = 0.0;
        String s = null;
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            x = in.nextInt();
        }

        Scanner d = new Scanner(System.in);
        if (d.hasNextDouble()) {
            y = d.nextDouble();
        }

        Scanner str = new Scanner(System.in);
        if (str.hasNextLine()) {
            s = str.nextLine();
        }

        System.out.println("String:" + s);
        System.out.println("Double:" + y);
        System.out.println("Int:" + x);
    }
}
*/
/*public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
           // System.out.println(" ");
            int x=sc.nextInt(); 
            // System.out.println(" ");
            double y = sc.nextDouble();
           Scanner sc1=new Scanner(System.in);
           // System.out.println(" ");
             String s = sc1.nextLine();
            System.out.println("String: "+s);
            System.out.println("Double: "+y);
            System.out.println("Int: "+x);
    }
}
*/

/*public class Solution{
	public static void main(String[] args) {
		int x=0;
		//String s=null;
		double y=0.0;
		Scanner in=new Scanner(System.in);
		if(in.hasNextInt()){
			x=in.nextInt();
		}
		if(in.hasNextDouble()){
			y=in.nextDouble();
		}
		Scanner in1=new Scanner(System.in);
		
	    String s=in1.nextLine();
		System.out.println("String:"+s);
		System.out.println("Double:"+y);
		System.out.println("Int"+x);
		
	}

	
	
	}*/
public class Solution {

    public static void main(String[] args) {
int inputInt ;
double inputDouble;
Object String = null;


Scanner scanner = new Scanner(System.in);


inputInt = scanner.nextInt();
inputDouble = scanner.nextDouble();
java.lang.String inputString = scanner.nextLine();
String string = scanner.nextLine();

//System.out.println("String: " + inputString);
System.out.println("String:"+string);
System.out.println("Double: " + inputDouble);
System.out.println("Int: " + inputInt);
    }
}
