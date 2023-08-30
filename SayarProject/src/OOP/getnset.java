package OOP;

public class getnset {
	
	private int puppyAge;
	
	public getnset(String name) {
		System.out.println("Name chosen is: "+name);
	}
	public void setAge(int age) {
		puppyAge=age;
	}
	
	public int getAge() {
		return puppyAge;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getnset pp=new getnset("Ag Net");
		pp.setAge(12);
		
		System.out.println(pp.getAge());
	}

}
