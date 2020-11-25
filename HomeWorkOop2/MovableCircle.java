package HomeWorkOop2;



public class MovableCircle implements Movable {
	public static void main(String[] args) {
		MovableCircle move = new MovableCircle(2, 3, 4, 4, 5);
		System.out.println(move);
	}
	private int radius;
	private MovablePoint center;
	
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		this.radius = radius;
		this.center = new MovablePoint(x, y, xSpeed, ySpeed);
		
	}

	@Override
	public String toString() {
		return "MovableCircle [radius=" + radius + ", center=" + center + "]";
	}

	@Override
	public void moveUp() {
		
	}

	@Override
	public void moveDown() {
		
	}

	@Override
	public void moveLeft() {
		
	}

	@Override
	public void moveRight() {
		
	}
	
}
