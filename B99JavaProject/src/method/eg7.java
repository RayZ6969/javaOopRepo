package method;

public class eg7 {
	
	int a,b;
	
	public eg7(int a ,int b) {
		this.a=a;
		this.b=b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		
		eg7 a1=new eg7(10, 20);
		
		System.out.println("Before swapping");
		System.out.println("a = "+a1.a+", b = "+a1.b);
		
		swap(a1);
		
		System.out.println("After swapping");
		System.out.println("a = "+a1.a+", b = "+a1.b);
		
		
	}
	
	public static void swap(eg7 a2) {
		int temp=a2.a;
		a2.a=a2.b;
		a2.b=temp;
		
		
	}

}
