package javaoops;

 abstract class Monkey{
	 abstract void  jump();
	 abstract void beat();
	 
 }
 class MonkeyMan extends Monkey{
	 void jump() {
		 System.out.println("jumpping.....");
	 }
	 void beat() {
		 System.out.println("beating......");
	 }
 }

public class Abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MonkeyMan h = new MonkeyMan();
		h.jump();
		h.beat();
		

	}

}
