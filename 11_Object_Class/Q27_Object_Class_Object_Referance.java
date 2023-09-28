class A
{
}

class B extends A
{
}

class C extends B
{
	void show()
	{
		System.out.println("Class C");
	}
}


class Q27_Object_Class_Object_Referance
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
error: cannot find symbol
                b.show();
                 ^
  symbol:   method show()
  
  
  
// 02
error: cannot find symbol
                a.show();
                 ^

--------------------------------------------------------------
*/






