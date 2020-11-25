package HomeWorkOop1;



public class Circle {
	public static void main(String[] args) {
		Circle c = new Circle(23.3);
		System.out.println(c.getArea());
	}
	private double radius = 1.0;
	private String  color = "red";
	
	public Circle() {}
	public Circle(double r) {
		this.radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI *Math.pow(radius, 2);  // ข้อ5
	}
	
}
