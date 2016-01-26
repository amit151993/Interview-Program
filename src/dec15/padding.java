package dec15;
import java.util.Scanner;

public class padding {

    public static void main(String[] args) {
    	
           
    	Scanner sc=new Scanner(System.in);
    	String[] str = new String[3]; 
    	Integer[] num = new Integer[3];
        
	 
    	for(int i=0;i<3;i++)
        {
            str[i] =sc.next();
            num[i] =sc.nextInt();
        }


        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            System.out.printf("%-15s%03d\n",str[i], num[i]);
        }
        System.out.println("================================");
        sc.close();
    }
}