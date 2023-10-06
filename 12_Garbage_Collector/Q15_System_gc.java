class A
{
	int x, y;
	public void finalize()
	{
		System.out.println("Finalize Method");
		System.out.println(10 / 0);
	}
}

class Q15_System_gc
{
	public static void main(String args[])
	{
		A a1 = new A();
		a1.x = 10;		a1.y = 20;
	
		a1 = null;
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


Jab finalize method me Exception generate hoti he, ot JVM ushe handle kar leta he or Yaha tab hota he 
Jab JVM finalize() method ko call karta he.

# Jab GC call hota he to baha head memory me store unreference Object ko destroy karta he.

--------------------------------------------------------
*/


