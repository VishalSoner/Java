/* Jab ham manually call karenge tab Exception aayega or ushe handle karna necessary he */
class A
{
	int x, y;
	public void finalize() //it work like Normal method
	{
		System.out.println("Finalize Method : (" + x +","+y+")");
		System.out.println(10 / 0);
	}
}

class Q18_System_gc
{
	public static void main(String args[])
	{
		A a1 = new A();
		a1.x = 10;		a1.y = 20;
		
		a1.finalize();
		
		System.out.println("Main Method");
	}
}
/*
Finalize Method : (10,20)
Exception in thread "main" java.lang.ArithmeticException: / by zero


--------------------------------------------------------
*/


