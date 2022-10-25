package javabasic.Basic;

import java.util.Arrays;
import java.util.Scanner;

public class updatinganarray {

	public static void main(String[] args) 
	{
		String [] mobilenames= {"oppo","samsung","redmi","apple","realme"};
        System.out.println("befour updating"+Arrays.toString(mobilenames));
        Scanner scan = new Scanner(System.in);
        System.out.println("please,tell us what is your position to update ");
        int pos =scan.nextInt();
        System.out.println("tell us your new value");
        String newone=scan.next();
        mobilenames[pos]=newone;
        System.out.println("after uploading value");
        for(String mobile:mobilenames)
        {
        	System.out.println(mobile);
        }
 
        
        
	}

}
