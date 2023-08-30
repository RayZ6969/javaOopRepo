package oopInterface;


public class circle implements Shape {
	
	double radius;
	
	public circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius=radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (radius*radius)*3.14;
	}

	@Override
	public double per() {
		// TODO Auto-generated method stub
		return 2*(3.14*radius);
	}
	
}
