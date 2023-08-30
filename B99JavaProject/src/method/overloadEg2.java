package method;

public class overloadEg2 {
	
	
	public static void sum() {
		int a=20;
		int b=30;
		
		System.out.println("Sum : "+(a+b));
	}

	
	
	public static int sum(int a) {
		int b = a+12;
		return b;
	}
	
	public static void sum(int a , int b) {
		System.out.println("Sum : "+(a*b));
	}
	
	public static void sum(float a , float b) {
		System.out.println("Sum : "+(a+b));
	}
	
	public static void sum(int a, int b , float c) {
		System.out.println("Sum : "+(a+b+c));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		float f=i;
		
		float g=(float)i;
		
		float tt=3.45f;
		int c=(int)tt;
		
		sum();
		System.out.println("Sum : "+sum(4));
		sum(30,4);
		sum(4.5f,23.4f);
		sum(3,4,5.9f);

	}
}
