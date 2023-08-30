package Array;

import java.util.Arrays;

public class ArrayEg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {-4,6,1,56,23,2};
		
		System.out.println("Before sorting "+Arrays.toString(A));
		
		Arrays.sort(A);
		System.out.println("After sorting "+Arrays.toString(A));
		
		int index=Arrays.binarySearch(A, 6);
		
		if (index<0) {
			System.out.println("not found");
		}
		else {
			System.out.println(A[index]+" is found at index :"+index);
		}
		
		int[]B =Arrays.copyOf(A, 7);
		System.out.println("B array value is :"+Arrays.toString(B)) ;
		
		Arrays.fill(B, 2,5,55);
		System.out.println("B array value is : "+Arrays.toString(B));
		
		int[]C =Arrays.copyOf(A, 6);
		boolean equal=Arrays.equals(A, C);
		
		if (equal) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}

}
