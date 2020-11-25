package HomeWorkOop1;



public class Rectangle {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(3, 4);
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getPerimeter());
		
	}
	private float length = 1.0f;
	private float width = 1.0f;
	
	public Rectangle() {}
	public Rectangle(float length, float width ) {
		this.length = length;
		this.setWidth(width);		
	}
	public float getLength() {
		return length;
		
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public double getArea() {
		return width*length;
		
	}
	public double getPerimeter() {
		return width+length*2;
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
