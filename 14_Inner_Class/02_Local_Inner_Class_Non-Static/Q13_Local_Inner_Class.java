/* class ko Loops ke andr bhi define kar sakte he. */

class A
{
	void show()
	{
		for( int i = 0; i < 2; i++)
		{	
			class B
			{
				void show2()
				{
					System.out.println("B If. Show - 2 ");
				}
			}
			B b = new B();
			b.show2();
			System.out.println("A show if - else");
		}
	}
}

class Q13_Local_Inner_Class
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
	
B If. Show - 2
A show if - else


-----------------------------
*/
 
 
 
 
 
 
 
 
 