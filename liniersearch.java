package javabasic.Basic;

import java.util.Scanner;

public class liniersearch {
	
	public int search ( int[] age1,int key)
	{
	for(int i=0;i<age1.length;i++)
	{
		if(age1[i]==key)
		{
			return i;
		}	
	}	
	}
	return -1;

	public static void main(String[] args) 
	{
	
		int [] age = {1,2,3,67,87,56,32,90};
		Scanner scan =new Scanner(System.in);
		liniersearch obj =new liniersearch();
		System.out.println("which number you want");
		int key=scan.nextInt();
		System.out.println(key+"your valus is founded by"+search.lin);
			
		

	}

}
