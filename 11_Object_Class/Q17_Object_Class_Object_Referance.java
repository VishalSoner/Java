class A
{}

class B extends A
{}

class C extends A
{}

class Q17_Object_Class_Object_Referance
{
	public static void main(String args[])
	{
		A a = new B();
		B b = (B)a;
		System.out.println("Done");
	}
}


/*

Exception in thread "main" java.lang.ClassCastException: C cannot be cast to B



IF  case - 1
A a = new A();
B b = (B)a;
Exception in thread "main" java.lang.ClassCastException: A cannot be cast to B



IF  case - 2
A a = new C();
B b = (B)a;
Exception in thread "main" java.lang.ClassCastException: A cannot be cast to B



IF  case - 3
A a = new B();
B b = (B)a;
Done
--------------------------------------------------------------
*/






