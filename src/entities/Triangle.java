package entities;

public class Triangle {
	
	private double a;
	private double b;
	private double c;
	
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
}
