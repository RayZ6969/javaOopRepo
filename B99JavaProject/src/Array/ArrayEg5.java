package Array;

import java.util.Scanner;

public class ArrayEg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of row");
		int row =sc.nextInt();
		
		System.out.println("Enter the number of column");
		int col=sc.nextInt();
		
		int[][] A=new int[row][col];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter a value");
				A[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Display Data Array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(A[i][j]+" ");	
			}
			System.out.println();
		}

	}

}
