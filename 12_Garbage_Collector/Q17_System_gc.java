/*

Q01. Kya ham finalize() method ko manually call kar sakte he?
Ans. Yes, we can call finalize memory manually, but it works as normal method.

*/
class A
{
	int x, y;
	public void finalize() //it work like Normal method
	{
		System.out.println("Finalize Method : (" + x +","+y+")");
	}
}

class Q17_System_gc
{
	public static void main(String args[])
	{
		A a1 = new A();
		a1.x = 10;		a1.y = 20;
		
		a1 = null;
		a1.finalize();
		
		System.out.println("Main Method");
	}
}
/*
Exception in thread "main" java.lang.NullPointerException


--------------------------------------------------------
*/


