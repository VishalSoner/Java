/* 

	Local Class ke bahar se change kare or Method ke andar change kare to no Error( Compile + run ).  

*/
class A
{
	void show()
	{
		int y = 201;
		class B
		{
			void show2()
			{
				System.out.println("BB");
			}
		}
		B b = new B();
		b.show2();
		y = 1000;
		System.out.println("Y : " + y);
	}
}

class Q19_Local_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 
BB
Y : 1000



1. Jab y Variable ko class B se call karenge to Compile + Run.
2. Jab y Variable ko change karenge But class B se call ko Error.
2. Jab y Variable ko change nai karenge But class B se call ko Error.

3. Jab y Variable ko change nai karenge But class B se call karenge to Error aayega


-----------------------------
*/
 
 
 
 
 
 
 
 
 