package method;

import java.util.Scanner;

public class RecursiveFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		long num=sc.nextInt();
		
		long ans=factorial(num);
		System.out.println("Factorial = "+ans);

	}
	
	public static long factorial(long num) {
		
		if (num<=1) {
			return 1;
		}
		else {
			return num*factorial(num-1);
		}
		
	}

}
