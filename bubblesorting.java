package javabasic.Basic;

import java.util.Arrays;

public class bubblesorting {
	public void bubblesorting (double [] arr )
	{
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=0;j<arr.length-i-1;j++)
			{
			
				if(arr[j]<arr[j+1])

				{
					double swap=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=swap;
					
				}		
			}
			
		}
			
	}
 
	public static void main(String[] args) {
		
		double [] a={98,89,76,67,56,23,45,49,23};
		System.out.println("befour sorting- "+Arrays.toString(a));
		bubblesorting obj=new bubblesorting();
		obj.bubblesorting(a);
		System.out.println("After sorting "+Arrays.toString(a));
		
	}

}
