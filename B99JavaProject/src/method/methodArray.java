package method;

import java.util.Arrays;
import java.util.Scanner;

public class methodArray {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]A=new int[5];
		input(A,A.length);
		display(A);
		
		System.out.println();
		
//		System.out.println("Maximum value : "+maxValue(A, 5));
//		System.out.println("Minimum value : "+minValue(A, 5));
		
		int max=maxValue(A, A.length);
		System.out.println("Maximun value is "+A[max]+" at index "+max);
		
		int min=minValue(A, A.length);
		System.out.println("Minimun value is "+A[min]+" at index "+min);

	}
	
	public static void input(int[]a,int n) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter value : ");
			a[i]=sc.nextInt();
		}
	}
	
	public static void display(int[]a) {
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
//	public static int maxValue(int[]a,int n ) {
//		Arrays.sort(a);
//		return a[a.length-1];
//	}
//	
//	public static int minValue(int[]a,int n ) {
//		Arrays.sort(a);
//		return a[0];
//	}
	
	public static int maxValue(int[]a,int n) {
		int max=a[0];
		int index=0;
		for (int i = 1; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
				index=i;
			}
		}
		return index;
	}
	
	public static int minValue(int[]a,int n) {
		int min=a[0];
		int index=0;
		for (int i = 1; i < a.length; i++) {
			if (a[i]<min) {
				min=a[i];
				index=i;
			}
		}
		return index;
	}

}
