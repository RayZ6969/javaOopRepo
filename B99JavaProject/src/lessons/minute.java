package lessons;

import java.util.Scanner;

public class minute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter hour");
		double hr=sc.nextDouble();
		
		System.out.println("Enter minute");
		double min=sc.nextDouble();
		
		System.out.println("Enter second");
		double sec=sc.nextDouble();
		
		double totalsec=hr*3600+min*60+sec;
		double totalmin=totalsec/60;
		
		System.out.println("Total minutes :"+totalmin);

	}

}
