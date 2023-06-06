package javaoops;




class Student{
	  int rollno;
	  String name;
	  
	  void insertRecords(int r, String n) {
		  rollno=r;
		  name=n;
		  
	  }
	  void displayRecords() {
		  System.out.println(rollno+" "+name);
		  
	  }
	  
}
public class ByMethod {
	
  

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.insertRecords(101,"suraj");
		s2.insertRecords(102,"nikhil");
		
		s1.displayRecords();
		s2.displayRecords();
		
		

	}

}
