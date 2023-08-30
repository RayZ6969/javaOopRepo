package exe;

import java.util.Scanner;

public class exe1Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		char a='y';
		
		
		
		do {int z=0;
			System.out.println("Enter first number");
			int num1= sc.nextInt();
			
			System.out.println("Enter second number");
			int num2= sc.nextInt();
			
			int sum=num1+num2;
			int sub=num1-num2;
			int multi=num1*num2;
			int div=num1/num2;
			
			System.out.println("Enter condition");
			String con=sc.next();sc.nextLine();
			
			switch (con) {
			case "+": {
				System.out.println("The sum of two numbers is : "+sum);		
			}break;
			case "-": {
				System.out.println("The subtraction of two numbers is : "+sub);
			}break;
			case "*": {
				System.out.println("The multiplication of two numbers is : "+multi);
			}break;
			case "/": {
				System.out.println("The division of two numbers is : "+div);
			}break;
			default:
				System.out.println("Wrong input");
				z++;
			}
			
			if (z==0) {
				System.out.println();
			
			System.out.println("Do you want to run again? Enter y to run again");
			 a=sc.next().charAt(0);
			}	
			 
		} while (a=='y');
		
		System.out.println();
		System.out.println("System ended");
	}

}
