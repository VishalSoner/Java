class A
{
	void show()
	{
		System.out.println("Class A");
	}
}

class B extends A
{
	void show()
	{
		System.out.println("Class B");
	}
}

class Q18_Object_Class_Object_Referance
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
		
		B b = new B();
		b.show();
	}
}


/*


Class A
Class B


--------------------------------------------------------------
*/






