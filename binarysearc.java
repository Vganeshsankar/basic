package javabasic.Basic;

import java.util.Arrays;

public class binarysearc {

		public int binary(int[] arr1,int low,int high,int key)
		{
			if(low<high)
			{
				int mid=(high+low)/2;
				if(arr1[mid]==key)
					return mid;
				else if(arr1[mid]>key)
					return binary(arr1,low,mid,key);
				else if(arr1[mid]<key)
					return binary(arr1,mid+1,high,key);
			}
			return -1;
		}

	public static void main(String[] args) 
	
	{

		
		int [] array= {23,56,78,90,78,35,234,65,2,12};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		binarysearc search = new binarysearc();
		int key =56;
		System.out.println(key+"found the index of "+search.binary(array,0,array.length,key));
	
	
	
	}

}
