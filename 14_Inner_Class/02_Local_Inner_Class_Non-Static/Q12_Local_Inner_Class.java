/* class ko if- else ke andr bhi define kar sakte he. */

class A
{
	void show()
	{
		if( true )
		{	
			class B
			{
				void show2()
				{
					System.out.println("B If. Show - 2");
				}
			}
			B b = new B();
			b.show2();
			System.out.println("A show if - else");
		}
	}
}

class Q12_Local_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

B If. Show - 2
A show if - else


-----------------------------
*/
 
 
 
 
 
 
 
 
 