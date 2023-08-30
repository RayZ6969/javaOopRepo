package OOP;

public class Person {
	
	String name;
	int age;
	public Person() {
		name="Aung Aung";
		age=30;
	}
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		System.out.println(p1.name+" - "+p1.age);
		
		Person p2=new Person("Mg Mg",20);
		System.out.println(p2.name+" - "+p2.age);

	}

}
