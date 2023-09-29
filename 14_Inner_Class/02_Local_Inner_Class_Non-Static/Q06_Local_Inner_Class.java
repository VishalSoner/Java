class A
{
	void show1()
	{
		class B 
		{}
		System.out.println("show - 1");
	}
	
	
	void show2()
	{	
		class B 
		{}
		System.out.println("show - 2");
	}
}

class Q06_Local_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		a.show1();
	}
}

/* 

show - 1



After Compile : 

A.class
A$1B.class
A$2B.class
Q06_Local_Inner_Class.class

-----------------------------
 */
 
 
 
 
 
 
 
 
 