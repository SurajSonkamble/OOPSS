package javaoops;


class Banks{
	int getRateOfintrest() {
		return 0;
	}
}
class BOB extends Banks{  // overriding
	int getRateOfintrest() {
		return 10;
	}
}
class Axis extends Banks{  //overriding
	int getRateOfintrest() {
		return 13;
	}
}
class ICIC extends Banks{ // overriding
	int getRateOfintrest() {
		return 15;
	}
}

public class Overriding {

	public static void main(String[] args) {
		ICIC c = new ICIC();
		System.out.println("Rate Of intrest ICIC Bank :"+ c.getRateOfintrest());
		Axis a = new Axis();
		System.out.println("Rate of intrest AXIC Bank :"+ a.getRateOfintrest())	;	
		BOB b = new BOB ();
		System.out.println("Rate of intrest SBI Bank :"+ b.getRateOfintrest())	;
		
		

	}

}
