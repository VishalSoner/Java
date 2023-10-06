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

class Q12_System_gc
{
	public static void main(String args[])
	{
		String s1 = new String("Ram");
		
		s1 = null;
		System.gc();
		System.out.println("Main Method");
	}
}
/*
Main Method



Yaha String Class ke corresponding finalize() method call hogi OR String ke pass koi v finalize method nai he 
eshki class ki finalize method call hogi or Object class ki finalize method Empty he.
--------------------------------------------------------
*/


