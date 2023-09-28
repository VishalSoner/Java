class A
{
	void show()
	{
		System.out.println("Class A");
	}
}

class B extends A
{
}

class C extends B
{
}


class Q25_Object_Class_Object_Referance
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
Class A


// 02
Class A


--------------------------------------------------------------
*/






