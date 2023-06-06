package javaoops;


abstract class Pen{
	abstract void write();
	abstract void refill();
}
class FountainPen extends Pen{
	void write() {
		System.out.println("write");
	}
	void refill() {
		System.out.println("Refill");
	}
	void changeNib() {
		System.out.println("Changing the nib");
	}
	
}

public class Abstraction1 {

	public static void main(String[] args) {
		FountainPen pen = new FountainPen();
		pen.changeNib();
		pen.write();
		pen.refill();
		
		

	}

}
