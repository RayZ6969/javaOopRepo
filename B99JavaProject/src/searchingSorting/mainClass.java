package searchingSorting;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc=new Scanner(System.in);
		
		
		do {
			electronicSystem ele=new electronicSystem();
			ele.WelcomePage();
			
			System.out.println("Enter y to run the system again");
			ch=sc.next().charAt(0);
		} while (ch=='y');
		System.out.println("System ended");

	}

}
