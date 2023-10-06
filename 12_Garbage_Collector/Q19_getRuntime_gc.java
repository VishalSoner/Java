/*
Runtime.getRuntime().gc() Method is better than System.gc() Method.
Because System.gc() Method  inherits  Runtime.getRuntime().gc().

Definition of System.gc()


public class System
{
	public static void gc()
	{
		Runtime.getRuntime().gc();
	}
}


# gc() Method of System class is static Method and ti has return type void (means no return value/type)

*/
class A
{
	public void finalize()
	{
		System.out.println("Finalize Method");
	}
}

class Q19_getRuntime_gc
{
	public static void main(String args[])
	{
		A a1 = new A();
		
		a1 = null;
		
		// Runtime.getRuntime().gc();
		
		Runtime r = Runtime.getRuntime();
		r.gc();
		
		System.out.println("Main Method");
	}
}
/*
Main Method
Finalize Method

--------------------------------------------------------
*/


