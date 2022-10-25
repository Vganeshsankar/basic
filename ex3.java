package javabasic.Basic;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner name =new Scanner(System.in);
		
		System.out.println("welcome to our shop");
		System.out.println("available fridge are haier,godrej,lg,samsung");
		String brand=name.nextLine();
	
       
		switch(brand)  
		{
		case "haier":
		System.out.println("which rate");
		String price =name.nextLine();
        
		if(10000<=30000)
		{
			System.out.println("one side dore available");
			
		}
		else 
		{
			System.out.println("not available");
			
		}
		break;
		
		case "godrej":
		System.out.println("which type and rate");	
		String price2 =name.nextLine();
		if(8000<=25000)
		{
			System.out.println("best slaction");
			
		}
		else
		{
			System.out.println("not available");
			
		}
		break;
		
		case"lg":
		System.out.println("three pice are available");
		String price3 =name.nextLine();
		if(9000<=35000)
		{
			System.out.println("one side and two side dore available");
		}
		else
		{
			System.out.println("not available");
			
		}
		
		case"samsung":
			String price4 =name.nextLine();
			System.out.println("croently not available");
			break;
			
		default:
			System.out.println("thank for shoping");

        
		}
      	}
        }
	
	  
	
        
        
		
	


