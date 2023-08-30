package method;

import java.util.Scanner;

public class eg4 {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		multi(num);
	}
	
	public static void multi(int num) {
		for (int i = 1; i <= 12; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}

}
