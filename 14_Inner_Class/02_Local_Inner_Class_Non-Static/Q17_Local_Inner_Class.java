/*

Local Class ke andr se jab direct call kar sakte he (compile + run). 

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
		System.out.println("AA");
	}
}

class Q17_Local_Inner_Class
{
	public static void main( String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

(this output after 1.8 version)
Y : 201
AA


javac-source 1.7 Q17_Local_Inner_Class.java
Local variable y is accessed from within inner class need to declared final





-----------------------------
*/
 
 
 
 
 
 
 
 
 