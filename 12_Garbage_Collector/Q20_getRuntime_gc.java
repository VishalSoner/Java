/*
Point :
	1. Runtime, class is a Singleton class.
	2. We can't create Object of Runtime class Beause it is Singleton Class. 
	3. In Runtime class getRuntime() method is factory function.
	4. gc() Method of Runtime.getRuntime().gc() method is to request JVM to call gc().
*/
class A
{
	public void finalize()
	{
		System.out.println("Finalize Method");
	}
}

class Q20_getRuntime_gc
{
	public static void main(String args[])
	{
		A a1 = new A();
		
		a1 = null;
		
		// Runtime.getRuntime().gc();
		
		Runtime r = new Runtime();
		r.gc();
		
		System.out.println("Main Method");
	}
}
/*
Main Method
error: Runtime() has private access in Runtime
                Runtime r = new Runtime();
                            ^
--------------------------------------------------------
*/


