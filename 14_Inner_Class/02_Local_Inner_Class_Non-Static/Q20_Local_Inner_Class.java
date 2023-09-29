/*
	
	Local Class ke bahar or Method ke andar change kare OR local ke andar se call kare jaError( Compile + run ). 
	
	Jab v class me local me final variable ko likhate ke bad change karenge to error aayega But hum call karenge to Error nai aayega.
	But hum change ke bad call karenge to Error aayega.
	
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
				System.out.println("Y : " + y);
			}
		}
		B b = new B();
		b.show2();
		y = 20;
		System.out.println("Y : " + y);
	}
}

class Q20_Local_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

error: local variables referenced from an inner class must be final or effectively final
                                System.out.println("Y : " + y);
                                                            ^

-----------------------------
*/
 
 
 
 
 
 
 
 
 