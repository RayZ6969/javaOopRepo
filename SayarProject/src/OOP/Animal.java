package OOP;

public class Animal {
	
	public String name;
	public int height;
	private String gender;
	
	public void getAnimal() {
		name="Ag Net";
		height=4;
	}
	
	public String getGender(String something) {
		this.gender=something;
		return gender;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog=new Animal();
		
		System.out.println(dog.name);
		
		dog.getAnimal();
		System.out.println(dog.name);
		System.out.println(dog.height);
		
		System.out.println(dog.gender);
		
		dog.getGender("Male");
		System.out.println(dog.gender);
	}

}
