package hw;

import java.util.Scanner;

public class hw1 {
	
	static Scanner sc=new Scanner(System.in);
	static int hr;
	static int min;
	static int sec;
	
	static int totalsec;
	
	static char yn;
	
	
	public static void inputData() {
		System.out.println("Enter hour");
		hr=sc.nextInt();
		
		System.out.println("Enter minute");
		min=sc.nextInt();
		
		System.out.println("Enter second");
		sec=sc.nextInt();
		
		
	}
	
	public static long chgSec() {
		if (min>=60) {
			hr++;
			min-=60;
		}
		
		totalsec=hr*3600+min*60+sec;
		return totalsec;
	}
	
	public static void Display() {
		System.out.println("Total second : "+chgSec());
	}
	
	public static char loop() {
		System.out.println("Do you want to do again? Enter y/n");
		yn=sc.next().charAt(0);
		
		return yn;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		do {
			inputData();
			chgSec();
			Display();
			loop();
			
		} while (yn=='y');
		System.out.println("System ended");

	}
}
