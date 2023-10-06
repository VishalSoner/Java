/*  Yaha Koi unreference Variable nai he. */

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

class Q11_System_gc
{
	public static void main(String args[])
	{
		A a = new A();
		a.x = 101; 		a.y = 201;
		
		System.gc();
		System.out.println("Main Method");
	}
}
/*

Main Method
--------------------------------------------------------
*/


