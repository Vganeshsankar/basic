package javabasic.Basic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class passinanarray {
	public void searching(double[] number1)
	{ 
		System.out.println(number1.length);
		number1[0]=900;
		System.out.println("connected by methade"+Arrays.toString(number1));
		
	}
	

	public static void main(String[] args)
	
	{
		
   double [] number = {12,89.56,37,54};
   System.out.println(" Before passing a values in methods"+Arrays.toString(number));	

   passinanarray obj=new passinanarray();
   obj.searching(number);
   
	}

}
