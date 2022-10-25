package javabasic.Basic;

import java.util.Arrays;
import java.util.Scanner;

public class ex4 {

	public void upload(int num1 []) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("possion is "+num1.length);
		System.out.println("which place to upload");		
		int pos=scan.nextInt();
		System.out.println("tell new value");
		int newpos=scan.nextInt();
		System.out.println("the value is");
		num1[pos]=newpos;
	    System.out.println("in correct value");	
		System.out.println(newpos);
	}
	
	
	
	public void  search(int [] num2)
	{
		
		Scanner scan2= new Scanner(System.in);
		System.out.println("which number you want");
		int pos =scan2.nextInt();
		for(int pos2=0;pos2<num2.length;pos2++)
		{
			if(num2[pos2]==pos)
			{
				System.out.println(pos+" this number posintion is "+pos2);
			}	
		}
		System.out.println("Value is not founded");
	}
		

	public static void main(String[] args)
	
	{
	    Scanner input =new Scanner(System.in);
	    //System.out.println("enter your value");
	    int [] num = {2,23,67,90,45,27};
	    
	    System.out.println("befour uploading"+Arrays.toString(num));
		ex4 obj =new ex4();
		obj.upload(num);

		ex4 obj1 =new ex4();
		obj1.search(num);   

		
	}

}
