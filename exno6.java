package javabasic.Basic;

import java.util.Arrays;
import java.util.Scanner;

public class exno6 {

	public static void main(String[] args)
	{
		
		Scanner scan =new Scanner(System.in);

		int [] a = {2,2,4,6,8,0,8,9,3,4,6};
		
		for(int i=0;i<a.length;i++)
		{		
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
						
				
		   }	
		}
	}
}	
		
		
	
	
	

	
