class A
{
	void show()
	{
		System.out.println("Vishal Soner");
	}
}

class Q01_Nullifying_reference_Variable
{
	public static void main(String args[])
	{
		A a1 = new A();
		A a2 = new A();
		a1.show();
		a2.show();
		
		a1 = null;
		
		a1.show();
		a2.show();
	}
}
/*
Vishal Soner
Vishal Soner
Exception in thread "main" java.lang.NullPointerException

--------------------------------------------------------
*/


