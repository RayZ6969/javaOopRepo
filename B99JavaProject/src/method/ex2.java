package method;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length");
		int length=sc.nextInt();
		
		System.out.println("Enter width");
		int width=sc.nextInt();
		
		System.out.println("The area of rectangle : "+area(length, width));
		System.out.println("The perimeter of rectangle : "+perimeter(length, width));
	}
	
	public static int area(int a,int b) {

		return (a*b);
	}
	
	public static int perimeter(int a,int b ) {
				return ((a+b)*2);
	}

}
