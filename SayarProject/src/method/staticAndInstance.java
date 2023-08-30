package method;

public class staticAndInstance {
	
	static String name="aung aung";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getName();
		staticAndInstance age=new staticAndInstance();
		age.getAge();
	}
	
	public static void getName() {
		System.out.println(name);
	}
	
	public void getAge() {
		int age=18;
		System.out.println(age);
	}

}
