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

class C extends B
{
}


class Q24_Object_Class_Object_Referance
{
	public static void main(String args[])
	{
		// 01
		B b = new C();
		b.show();
		
		// 02
		A a = new C();
		a.show();
	}
}


/*
// 01
Class B


// 02
Class B


--------------------------------------------------------------
*/






