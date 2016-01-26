package dec15;

public class concatation {
	
public static void main(String []args){
	for(int i=0;i<=100;i++){
		for(int j=0;j<=i;j++){
			if(j==i){
				System.out.println(i);
			}
		
		if(i%j==0){
			break;
		}
	}
}
}
}
