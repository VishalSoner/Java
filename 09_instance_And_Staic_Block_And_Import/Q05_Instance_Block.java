class A
{
	// instance block
	{			System.out.println("Instance block - 1");			 }
	
	static void show()
	{
		System.out.println("A Show Method");
	}
}

class Q05_Instance_Block
{
	{
		System.out.println("Instance block - 1");
	}
	public static void main(String args[])
	{
		A.show();
	}
}
 
/* 
Output :- 
A Show Method

------------------------------------------------
*/




