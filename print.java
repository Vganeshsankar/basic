package javabasic.Basic;

import java.util.Scanner;

public class print {

	public static void main(String[] args) {
		
	Scanner mar = new Scanner(System.in);

	System.out.println("enter your name");
	String q= mar.nextLine();// next not give space
	System.out.println(q);
	
System.out.println("tamil");
int a= mar.nextInt();
System.out.println(a);

System.out.println("english");
int b= mar.nextInt();
System.out.println(b);

System.out.println("math");
int c= mar.nextInt();
System.out.println(c);

System.out.println("science");
int d= mar.nextInt();
System.out.println(d);


	}

}
