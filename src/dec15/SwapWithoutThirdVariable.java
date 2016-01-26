package dec15;

public class SwapWithoutThirdVariable {

	
		public static void main(String...args) {

		       int x=10,y=20;
	//   =================First method========================
		      /* x=x^y;
		       y=x^y;
		       x=x^y;*/
		       
//=======================Second method========================		       
		       x=x+y;
		       y=x-y;
		       x=x-y;
		       System.out.println(x);
		       System.out.println(y);
		    }
		}