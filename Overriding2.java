package javaoops;



class Vehicle{
	void run() {
		System.out.println("vehicle is running");//overriding
	}
}
class Bike extends Vehicle{
	void run() {
		System.out.println("Bike is running");//overriding
	}
}
class Car extends Vehicle{
	void run() {
		System.out.println("car is running");//overriding
	}
}
public class Overriding2 {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.run();
		Car c = new Car();
		c.run();
		Bike b = new Bike();
		b.run();
		
		

	}

}
