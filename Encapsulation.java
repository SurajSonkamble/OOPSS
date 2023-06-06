package javaoops;

public class Encapsulation {

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop();
		l1.setprice(31);
		System.out.println(l1.getPrice());

	}

}

class Laptop{
	int ram;
	private int price;
	
	public void setprice(int price) {
		//is the user an admin
		boolean isAdmin = true;
		if(!isAdmin) {
			System.out.println("you cannot set the value");
		}
		else {
			this.price=price;
			
		}
		
		
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}