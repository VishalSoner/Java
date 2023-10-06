class A
{
	A()
	{
		System.out.println("Anonymous Object");
	}
	void show()
	{
		System.out.println("Show Method");
	}
}

class Q04_Anonymous_Object
{
	public static void main(String args[])
	{
		new A();
	}
}
/*
Anonymous Object
Show Method

Jise hi Object Create wali line exectue hogi, Wese hi Object GC ke pass chala jayega.
Kyu ki Yaha Dereferenced Object he , Jo ek bar use hokar GC ke pass chala jayega.
--------------------------------------------------------
*/


