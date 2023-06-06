package javaoops;

//initilizing through by reference variable
 class Employee{
	 int e_id;
	 String e_name;
	 String company;
 }


public class Java {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.e_id=101;
		e1.e_name="suraj";
		e1.company="xangars";
		
		e2.e_id=102;
		e2.e_name="jivan";
		e2.company="xangars";
		
		System.out.println("Employee id : "+e1.e_id);
		System.out.println("Employee Name : "+e1.e_name);
		System.out.println("employee Company : "+e1.company);
		System.out.println();
		
		System.out.println("Employee id : "+e2.e_id);
		System.out.println("Employee id : "+e2.e_name);
		System.out.println("Employee id : "+e2.company);
		
		
		
		

	}

}
