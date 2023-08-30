package method;

public class typeConvertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		double b=a;
		float c=a;
		double d=c;
		System.out.println(b);
		System.out.println(d);
		
		double z=234.9;
		float y=(float)z;
		int x=(int)y;
		
		System.out.println(y);
		System.out.println(x);
		
		double dr=x;
		System.out.println(dr);
	}

}
