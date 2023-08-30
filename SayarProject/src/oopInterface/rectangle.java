package oopInterface;

public class rectangle implements Shape {
	
	double length;
	double width;
	
	public rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public double per() {
		// TODO Auto-generated method stub
		return 2*(length+width);
	}

}
