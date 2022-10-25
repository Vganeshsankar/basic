package javabasic.Basic;

import java.util.Scanner;

public class runnanarray {

	public static void main(String[] args) 
	{
		String [] name= new String[10];
		
		Scanner name1 = new Scanner(System.in);
		
		
	for(int i=0;i<name.length;i++)
	{
		System.out.println("what is your name");
		name[i]=name1.nextLine();
	}
	for(int i=0;i<name.length;i++)
	{
		if(name[i]!=null)
		System.out.println(name[i]);
	}
	
	
	}

}
