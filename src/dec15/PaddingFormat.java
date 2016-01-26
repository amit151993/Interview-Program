package dec15;
public class PaddingFormat {    
    public static void main(String[] args) {
        String[] languages = { "java", "cpp", "python" };
        int[] values = { 100, 65, 60 };

        for (int i = 0; i < 3; i++) {
            System.out.printf("%-8s%04d %n", languages[i], values[i]);
            //Complete this line
        }
        System.out.printf("%-12s%-12s%s\n","Column 1","Column 2","Column3");
       // System.out.printf("%-12.10s%s", "Hello World","World");
        System.out.printf("%-12d%-12d%07d\n",15,12,5);

        
        
    }
}

//=================================================================//
/*
        System.out.printf("Integer : %d\n",15);
        System.out.printf("Floating point number with 3 decimal digits: %.3f\n",1.21312939123);
	        System.out.printf("Floating point number with 8 decimal digits: %.8f\n",1.21312939123);
	 
	        System.out.printf("String: %s, integer: %d, float: %.6f", "Hello World",89,9.231435);
	    }
	}
*/
//=====================================================================//

