package javaoops;
//single inheritance

class Emp{
	double salary=35000;
}
class Manager extends Emp{
	int bonus=1000;
}

public class InheritanceTest {

	public static void main(String[] args) {
		Manager m1 = new Manager();
		System.out.println("salary of employee : "+m1.salary);
		System.out.println("bonus of Manager : "+m1.bonus);
		

	}

}
