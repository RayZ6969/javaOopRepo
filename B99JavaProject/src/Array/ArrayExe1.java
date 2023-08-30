package Array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayExe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
					
		System.out.println("Enter temperature count");
		int hm=sc.nextInt();
		
		int[] A= new int[hm];
		int sum=0;
		
		for (int i = 0; i <hm; i++) {
			System.out.println("Enter day ("+(i+1)+") temperature");
			A[i]=sc.nextInt();
			sum+=A[i];
		}
			
		double avg=sum/hm;
		System.out.println("Average temperature is :"+avg);
		
		System.out.println();
		
		int a=0;
		
		for (int i = 0; i < hm; i++) {
			if (A[i]>avg) {
				a++;
			}
		}
		System.out.println(a+" days were above average");
		
		int b=0;
		
		for (int i = 0; i < hm; i++) {
			if (A[i]<avg) {
				b++;
			}
		}
		System.out.println(b+" days were below average");
		
		System.out.println();
		
		System.out.println("Temperatures :"+Arrays.toString(A));
		
		
		Arrays.sort(A);
		System.out.println("Sorted Temperatures :"+Arrays.toString(A));
		
		System.out.println();
		
		System.out.println("Two coldest days : "+A[0]+","+A[1]);
		System.out.println("Two hottest days : "+A[hm-1]+","+A[hm-2]);		
		
		System.out.println();
		
		int[] B=Arrays.copyOf(A, hm);
		int[] C= {10,20,30,40,50,60};
		
		boolean equal=Arrays.equals(A, C);
		
		if (equal) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
			Arrays.fill(C, 34);
			System.out.println(Arrays.toString(C));
		}
	}

}
