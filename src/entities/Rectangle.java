package entities;

public class Rectangle {
	
	private double width;
	private double height;
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2*(width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}

}
