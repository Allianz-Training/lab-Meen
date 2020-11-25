package HomeWorkOop2;

public class MovableRectangle implements Movable{
	public static void main(String[] args) {
		
	}
	private MovablePoint topleft ;
	private MovablePoint bottomRight;
	
	public MovableRectangle(int x1, int y1,int x2, int y2, int xSpeed, int ySpeed){
		this.topleft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
		
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

	@Override
	public String toString() {
		return "MovableRectangle [topleft=" + topleft + ", bottomRight=" + bottomRight + "]";
	}
	
	
	
}
