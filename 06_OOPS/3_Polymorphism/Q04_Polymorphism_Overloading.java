class A
{
	void show(byte x, byte y)
	{
		System.out.println("Byte.");
	}
	
	void show(short x, short y)
	{
		System.out.println("Short.");
	}
	
	void show(int x, int y)
	{
		System.out.println("Int.");
	}
	
	void show(long x, long y)
	{
		System.out.println("Long.");
	}
}
class Q04_Polymorphism_Overloading
{
	public static void main(String args[])
	{
		A a = new A();
		byte b1 = 10, b2 = 20;
		short s1 = 100, s2 = 200;
		int i1 = 1000, i2 = 2000;
		long l1 = 10000, l2 = 20000;
		
		a.show(b1, b2);
		a.show(s1, s2);
		a.show(i1, i2);
		a.show(l1, l2);
		System.out.println("");
		
		a.show(1, 2);
		a.show(10, 20);
		a.show(100, 200);
		a.show(1000, 2000);
		a.show(10000, 20000);
	}
}

/* 
Output :- 

Byte.
Short.
Int.
Long.

Int.
Int.
Int.
Int.


--------------------------------------------------------------------------------------------- 
*/




