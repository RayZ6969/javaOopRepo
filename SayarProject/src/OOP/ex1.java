package OOP;

import java.util.Scanner;

public class ex1 {
	
	public Scanner sc=new Scanner(System.in);
	String name;
	int age;
	
	public ex1() {
		System.out.println("Enter name");
		 name=sc.nextLine();
		
		System.out.println("Enter age");
		 age=sc.nextInt();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex1 zz=new ex1();
		System.out.println("Student Name : "+zz.name);
		System.out.println("Student Age : "+zz.age);
	}

}
