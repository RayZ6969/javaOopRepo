package OOP;

public class inheritance {
	
	protected  String brand="Ford";
	public void honk() {
		System.out.println("Tuut, tuut");
	}
	
}

class Cars extends inheritance{
	private String modelName="Mustang";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars myCar=new Cars();
		myCar.honk();
		System.out.println(myCar.brand+" "+myCar.modelName);
	}
}
