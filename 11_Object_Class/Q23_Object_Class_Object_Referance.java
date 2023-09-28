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
	void show()
	{
		System.out.println("Class C");
	}
}


class Q23_Object_Class_Object_Referance
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
Class C


// 02
Class C


--------------------------------------------------------------
*/






