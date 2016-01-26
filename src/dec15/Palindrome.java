package dec15;

//import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//Scanner scan=new Scanner(System.in);
		
		String st="MOOM";
		String revstring="";
		for(int i=st.length()-1;i>=0;--i)
		{
		 revstring=revstring+st.charAt(i);
		}
		if(revstring.equalsIgnoreCase(st)){
			System.out.println("String is palindome");
		}
			else
			{
				System.out.println("String is not palindrome");
			}
		}
	}


