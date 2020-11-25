package HomeWorkOop1;

public class CircleAnother {
	public static void main(String[] args) {
		CircleAnother circleAnother = new CircleAnother(23.3);
		System.out.println(circleAnother.getArea());
	}
	private double radius = 1.0;
	
	public CircleAnother() {}
	public CircleAnother(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return getRadius();
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI *Math.pow(radius, 2);
	}
	public double getCircumference() {
		return getCircumference();
	}
	@Override
	public String toString() {
		return "CircleAnother [radius=" + radius + "]";
	}
	
	
}
