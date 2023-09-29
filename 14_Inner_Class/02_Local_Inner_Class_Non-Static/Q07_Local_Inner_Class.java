class A
{
	void show1()
	{
		class B 
		{}
		
		class C
		{}
		
		System.out.println("show - 1");
	}
	
	
	void show2()
	{	
		class C
		{}
		System.out.println("show - 2");
	}
}

class Q07_Local_Inner_Class
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
A$1C.class
A$2C.class
Q07_Local_Inner_Class.class

-----------------------------
 */
 
 
 
 
 
 
 
 
 