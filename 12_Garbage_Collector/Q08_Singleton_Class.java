class A
{
	private A()
	{}
	
	static A getObject()
	{
		return new A();
	}
}

class Q08_Singleton_Class
{
	public static void main(String args[])
	{
		A a1 = A.getObject();
		A a2 = A.getObject();

		System.out.println( a1.hashCode() );
		System.out.println( a2.hashCode() );
	}
}
/*
366712642
1829164700


They Both are Different.
--------------------------------------------------------
*/


