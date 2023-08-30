package method;

public class eg8 {
	
	String name;
	int age;	
	static String module="Unit 1 Programming";
	
	public void createStudent() {
		
		System.out.println("Create student object = "+name+" "+age);
		
	}
	
	public static void display() {
		System.out.println(module);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eg8 st1=new eg8();
		st1.name="Kyw g";
		st1.age=19;
		st1.createStudent();
		
		eg8 st2=new eg8();
		st2.name="Mg Mg";
		st2.age=20;
		st2.createStudent();
		
		System.out.println(eg8.module);
		eg8.display();
	}

}
