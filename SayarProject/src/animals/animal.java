package animals;

import OOP.SuperClass;

public class animal {
	String color="white";
	public animal() {
		// TODO Auto-generated constructor stub
		System.out.println("Animal is created");
	}
	
	public void display() {
		System.out.println("Display method of animal class ");
	}
}

	
	
	class Dog extends animal{
		String color= " black";
		public Dog() {
			// TODO Auto-generated constructor stub
			super();
			System.out.println("dog is created");
		}
		
		public void display() {
			System.out.println("Display method of Dog class");
		}
		
		public void printColor() {
			System.out.println(color);
			System.out.println(super.color);
			display();
			super.display();
		}
		
	
	}
	class textSuper{
		public static void main(String[] args) {
			Dog zz=new Dog();
			zz.printColor();
			
			
		}
	}


