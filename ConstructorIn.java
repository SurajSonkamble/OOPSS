package javaoops;


class Base{
	Base(){
		System.out.println("base constructor"); //Constructor inheritance
	}
}
class Derived extends Base{
	Derived(){
		System.out.println("derived constructor");//Constructor inheritance
	}
}

public class ConstructorIn {

	public static void main(String[] args) {
		Derived d = new Derived();
		

	}

}
