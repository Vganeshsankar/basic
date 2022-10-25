package javabasic.Basic;

import java.util.Arrays;

public class binarysearch {

public int binary(int[] a1,int low,int high,int key )
{

if(low<high)
{
int mid=(high+low)/2;	

if (a1[mid]==key)
{	
	return mid;
}
else if(a1[mid]<key)
{	
	return binary(a1,mid+1,key,high);
}
else if(a1[mid]>key)
{		
    return binary(a1,mid,key,low);
}			
}

return -1;

}

	public static void main(String[] args) 
	{
		int  [] a= {45,89,67,23,12,90,46,78};
		Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        binarysearch obj =new binarysearch();
        int key =23;
        System.out.println(key+" founded by index of "+obj.binary(a,0,a.length,key));
		
	}

}
