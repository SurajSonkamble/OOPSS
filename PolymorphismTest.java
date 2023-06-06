package javaoops;


class Student1{
	String name;
	int age;
	
	void printinfo(String name) {
		System.out.println(name);
	}
	void printinfo(int age) {
		System.out.println(age);
	}
	void printinfo(String name, int age) {
		System.out.println(name+" "+age);
	}
}


public class PolymorphismTest {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.name="suraj";
		s1.age = 24;
		
		s1.printinfo(s1.name,s1.age);
		
		

	}

}
