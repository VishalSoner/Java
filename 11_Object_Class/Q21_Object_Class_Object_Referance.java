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

class Q21_Object_Class_Object_Referance
{
	public static void main(String args[])
	{
		A a = new B();
		a.show();
	}
}


/*

Class A


--------------------------------------------------------------
*/






