package javaoops;


class Rect{
	double length;
	double width;
	double Area;
	
	void insertValue(double l, double w) {
		length =l;
		width = w;
		
	}
	
	void AreaOfRectangle() {
		Area = length*width;
		System.out.println("Area of length : "+ Area);
		
			}
}
public class Rectangle {

	public static void main(String[] args) {
		Rect r1 = new Rect();
		r1.insertValue(20,40);
		r1.AreaOfRectangle();
	

	}

}
