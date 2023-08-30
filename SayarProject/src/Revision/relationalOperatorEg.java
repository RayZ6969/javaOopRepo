package Revision;

import java.util.Scanner;

public class relationalOperatorEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		
		
		for (int i = 0; i <3; i++) {
			
			System.out.println("Enter User Name");
			String username=sc.nextLine();
			
			System.out.println("Enter Password");
			String password=sc.nextLine();
			
			if (username.equals("Mg Mg")&&password.equals("123")) {
				System.out.println("Correct Username and Password");
			}
			else {
				System.out.println("wrong");
			}
		}
		
	

	}

}
