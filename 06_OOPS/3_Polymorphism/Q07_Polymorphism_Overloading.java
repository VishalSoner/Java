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
class Q07_Polymorphism_Overloading
{
	public static void main(String args[])
	{
		A a = new A();
		a.show(10, 20);
	}
}

/* 
Output :- 

no suitable method found for show(int,int)
    a.show(10, 20);
      ^
--------------------------------------------------------------------------------------------- 
*/




