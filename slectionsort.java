package javabasic.Basic;

public class slectionsort {
	public void sort(int [] a1)
	{
		
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a1.length;j++)
			{
			if(a1[i]<a1[j])
			{
				a1[i]^=a1[j];
				a1[j]^=a1[i];
				a1[i]^=a1[j];
			}
				
			}
		}	
			
	}
	public static void main(String[] args)
	
	{
	
   int [] a= {55,41,7,8,9,15};
   
   slectionsort obj = new slectionsort();
   obj.sort(a);
   
   for(int b:a)
   {
	System.out.println(b);   
   }
   
   
	}

}
