package javaoops;

 
class Bank{
	void BankNname() {
		System.out.println("this is indian bank ");
	}
}
class RBI extends Bank{
	void BankRbi() {
		System.out.println("Reserve Bank of india");
	}
}
class BOI extends RBI{
	void BankBoi() {
		System.out.println("Bank of india");
	}
}
class SBI extends BOI{
	void BankSbi() {
		System.out.println("State Bank of india");
	}
}

	


public class MultiLevel {

	public static void main(String[] args) {
		SBI s1 = new SBI();
		s1.BankSbi();
		s1.BankBoi();
		s1.BankRbi();
	

	}

}
