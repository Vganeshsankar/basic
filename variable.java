package javabasic.Basic;

public class variable {

	static int a = 45; // static
	
	
	int b = 34;  //global
	
	
	public void g()
	{
		System.out.println(b);
		
		int z = 78;  //local
		
		System.out.println(z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
variable h =new variable();
h.g();

int q = 34;
System.out.println(q);  //instent variable

		System.out.println(a);
		
	}

}
