package oopInterface;

public class triangle implements Shape{
	
	double a;
	double b;
	double c;
	
	
	
	public triangle(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	@Override
	public double per() {
		// TODO Auto-generated method stub
		return a+b+c;
	}

}
