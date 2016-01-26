package dec15;

public class RevString {

	public static void main(String[] args) {
		
System.out.println(rev("1234480000"));
	}
	
	public static String rev(String a){
		String rev="";
		for(int i=a.length()-1;i>=0;--i){
			rev+=a.charAt(i);
		}
		return  rev;
	}

}
