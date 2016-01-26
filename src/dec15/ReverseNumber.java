package dec15;

public class ReverseNumber {
	 public static void main(String[] args) {
		 System.out.println(rev(1452000));
	 }
	 public static int rev(int a){
   	  int reverse=0;
   	  
   	  while(a!=0){
   		  int r=a%10;
   		  reverse=reverse*10+r;
   		  a=a/10;
   	  }
   	  return reverse;
     }
  }
	 
	


