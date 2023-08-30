package method;

import java.util.Scanner;

public class eg3 {
	
	static Scanner sc=new Scanner(System.in);
	static float ft;
	static float inc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float f1=InputData();
		float f2=InputData();
		
		float resfeet=add(f1, f2);
		display(resfeet);
		

	}
	
	public static float InputData() {
	System.out.println("Enter feet");
	 ft=sc.nextInt();
	
	System.out.println("Enter inches");
	 inc=sc.nextFloat();
	 
	 if (inc>=12) {
		ft++;
		inc-=12;
	}
	
 	float feet=convertFeet();
 	
 	return feet;
	}
	
	public static float convertFeet() {
		return ft+(inc/12);
	}
	
	public static float add(float f1,float f2) {
		return f1+f2;
	}
	
	public static void display(float resfeet) {
		System.out.println("Result : "+resfeet);
	}

}
