class A
{
	static A show()
	{
		class B
		{
			B set(int x, int y)
			{
				return this;
			}
			
			void show1()
			{
				System.out.println("local Class Method Chaining");
			}
		}
		return this;
	}
}

class Q22_Local_Inner_Class
{
	public static void main( String args[])
	{
		A a = A.show();
		// A.B b = a.show().new B();
		// new A().show().new B();//.set(10, 20);
	}
}

/* 

error: cannot assign a value to final variable y
                y = 20;
                ^
-----------------------------
*/
 
 
 
 
 
 
 
 
 