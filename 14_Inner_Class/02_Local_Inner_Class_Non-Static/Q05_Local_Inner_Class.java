class A
{
	void show()
	{
		class B 
		{
			void show2()
			{
				System.out.println("B - show2");
			}
		}
	}
	void show1()
	{
		B b = new B();
		b.show2();
		
		System.out.println( "A - show1");
	}
}

class Q05_Local_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		a.show1();
	}
}

/* 

Q05_Local_Inner_Class.java:15: error: cannot find symbol
                B b = new B();
                ^
  symbol:   class B
  location: class A
Q05_Local_Inner_Class.java:15: error: cannot find symbol
                B b = new B();
                          ^


After Compile :

A.class
A$1B.class
Q05_Local_Inner_Class.class

-----------------------------
 */
 
 
 
 
 
 
 
 
 