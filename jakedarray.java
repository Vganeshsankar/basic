package javabasic.Basic;

public class jakedarray {

	public static void main(String[] args) 
	{
 
	int [][] jaggedArray=new int[3][];
	jaggedArray[0]=new int [3];
	jaggedArray[1]=new int [7];
	jaggedArray[2]=new int [1];
	int  count=0;
	//Value assumtion
	for(int column=0;column<3;column++)
	{
		for(int row=0;row<jaggedArray[column].length;row++)
		{
			jaggedArray[column][row]=count+=10;
		}
	}
	//printb a jagged value
	for(int column=0;column<3;column++)
	{
		for(int row=0;row<jaggedArray[column].length;row++)
		{
			System.out.print(jaggedArray[column][row]+" ");
		}
		System.out.println();
	}

}
	}


