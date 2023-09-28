class A
{
}

class B extends A
{
	void show()
	{
		System.out.println("Class B");
	}
}

class Q20_Object_Class_Object_Referance
{
	public static void main(String args[])
	{
		A a = new B();
		a.show();
	}
}


/*


error: cannot find symbol
                a.show();
                 ^


--------------------------------------------------------------
*/






