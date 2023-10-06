/* Ek Object ke Corresponding JVM/GC ek bar hi call hoti he */
class A
{
	int x, y;
	public void finalize()
	{
		System.out.println("Finalize Method : (" + x +","+y+")");
	}
}

class Q14_System_gc
{
	public static void main(String args[])
	{
		A a1 = new A();
		a1.x = 10;		a1.y = 20;
	
		a1 = null;
		System.gc();
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


