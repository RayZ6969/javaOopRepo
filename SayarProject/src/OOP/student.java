package OOP;

public class student {
	
	public student() {
		System.out.println("Student constractor");
	}
	
	public  student(String n1) {
		System.out.println("The name is : "+n1);
	}
	
	public  student(int n2) {
		System.out.println("The age is : "+n2);
	}
	
	public static void main(String[] args) {
		student st1=new student("Mg Mg");	
		student dt2 = new student();
		student ss =new student(98);
	}

}
