package javaoops;



  abstract class Animals{
 abstract void walk();
	 
 
}
class Horse extends Animals{
	void walk() {
		System.out.println("walks on 4 lagas");
	}
}
class Chicken extends Animals{
	void walk() {
		System.out.println("walks on 2 lags");
	}
	
}
	


public class Abstraction {

	public static void main(String[] args) {
		Horse h = new Horse();
		h.walk();
		
	    

	}

}
