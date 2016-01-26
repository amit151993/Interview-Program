package dec15;
class Bike extends Inheritance{
	public void Engine(){
		System.out.println(" Engine started: ...");
	}
}
class Car extends Inheritance{
	public void Engine(){
		System.out.println(" Car started:... ");
	}
}

public class Inheritance {

	public static void main(String[] args) {
	Bike t=new Bike();
	t.Engine();
	Car c =new Car();
	c.Engine();
	;
	}

	
		
	
}
