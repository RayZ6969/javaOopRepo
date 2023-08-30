package OOP;

 class My_Calculation {
	int z;
	public void addition(int x,int y) {
		z=x+y;
		System.out.println("The sum of the given numbers : "+z);
	}
	
	public void subtraction(int x,int y) {
		z=x-y;
		System.out.println("The subtraction of the given numbers : "+z);
	}

}

 class Calculation extends My_Calculation{
	public void multiplication(int x,int y) {
		z=x*y;
		System.out.println("The product of given numbers : "+z);
	}
	
	public static void main(String[] args) {
		int a=20;
		int b=10;
		Calculation demo=new Calculation();
		demo.addition(a, b);
		demo.subtraction(a, b);
		demo.multiplication(a, b);
		
	}
}
