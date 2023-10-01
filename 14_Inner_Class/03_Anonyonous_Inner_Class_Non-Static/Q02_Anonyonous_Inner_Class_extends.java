abstract class A 
{
	void show()
	{
		System.out.println("Vishal Soner - 1");
	}
}


class Q02_Anonyonous_Inner_Class_extends
{
	public static void main(String args[])
	{
		A a = new A(){};
		a.show();
	}
}

/* 

Vishal Soner - 1


1. Super Class ka referance variable sub-class ke object ko store kar sakta he.

2. Abstract class ka Object nai bana sakte he,
3. But Abstract class ka referance create kar sakte he.


-----------------------------------------------------------------------------------------------
*/




