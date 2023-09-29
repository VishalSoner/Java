class A
{
	void show(int x, double y)
	{
		System.out.println("Int : Double");
	}
	
	void show(double x, int y)
	{
		System.out.println("Double: Int");
	}

}
class Q08_Polymorphism_Overloading
{
	public static void main(String args[])
	{
		A a = new A();
		a.show(10, 20.20);
		a.show(10.10, 20);
		
		a.show(10, 20);
		a.show(10.10, 20.20);
	}
}

/* 
Output :- 

Int : Double
Double: Int

error: reference to show is ambiguous
       a.show(10, 20);
         ^
error: no suitable method found for show(double,double)
        a.show(10.10, 20.20);
          ^
--------------------------------------------------------------------------------------------- 
*/




