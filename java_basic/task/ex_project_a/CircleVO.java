package ex_project_a;

public class CircleVO {
	
	private int radius;

	public CircleVO(){}

	public CircleVO(int radius) {
		this.radius = radius;
	}
	
	public int surface() {
		return (int)(radius * radius * Math.PI);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}

