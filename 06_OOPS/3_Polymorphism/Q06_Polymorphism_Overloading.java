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

}
class Q06_Polymorphism_Overloading
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
		
	}
}

/* 
Output :- 

no suitable method found for show(int,int)
    a.show(i1, i2);
     ^
error: no suitable method found for show(long,long)
	a.show(l1, l2);
     ^


--------------------------------------------------------------------------------------------- 
*/




