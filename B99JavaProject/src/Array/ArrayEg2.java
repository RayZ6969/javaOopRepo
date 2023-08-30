package Array;

import java.util.Iterator;

public class ArrayEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Stu_height= {175,167,160,164,183,187,188,179,176,175,169,175,176,178,165};
		
		
		int aboveavg=0;
		int belowavg=0;
		int sum=0;
		for (int i = 0; i < Stu_height.length; i++) {
			sum+=Stu_height[i];
			
		}
		
		int avg=sum/Stu_height.length;
		System.out.println("Total = "+sum);
		System.out.println("Average = "+avg);
		
		System.out.println();
		
		for (int i = 0; i < Stu_height.length; i++) {
			if (Stu_height[i]>avg) {
				aboveavg++;
			}
			else if (Stu_height[i]<avg) {
				belowavg++;
			}	
		}
		System.out.println("Above average = "+aboveavg);
		System.out.println("Below average = "+belowavg);
		
		System.out.println();
		
		int max=Stu_height[0];
		int min=Stu_height[0];
		
		for (int i = 1; i < Stu_height.length; i++) {
			if (Stu_height[i]>max) {
				max=Stu_height[i];
			}
			else if (Stu_height[i]<min) {
				min=Stu_height[i];
			}
		}
		System.out.println("The shortest height = "+min);
		System.out.println("The highest height = "+max);
		}
	}
