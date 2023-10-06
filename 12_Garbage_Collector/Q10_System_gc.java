class A
{
	int x, y;
	void show()
	{
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
	}
	public void finalize()
	{
		System.out.println("Finalize Method");
	}
}

class Q10_System_gc
{
	public static void main(String args[])
	{
		A a = new A();
		a.x = 101; 		a.y = 201;
		
		a = null;
		System.gc();
		
		System.out.println("Main Method");
	}
}
/*

1. At a Time Request Accept By JVM.
	Finalize Method
	Main Method
	  
2. After Printign Main Method Accept By JVM.
	Main Method
	Finalize Method
	  
3. Request Not Accept By JVM.
	Main Method
--------------------------------------------------------
*/


