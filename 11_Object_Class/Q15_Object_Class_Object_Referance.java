class A
{}

class B extends A
{}

class C extends A
{}

class Q15_Object_Class_Object_Referance
{
	public static void main(String args[])
	{
		B b = new A();
		System.out.println("Done");
	}
}


/*

	B b = new A();
error: incompatible types: A cannot be converted to B
                B b = new A();
                      ^



if Case : 
	C c = new A();
error: incompatible types: A cannot be converted to C
                C c = new A();
                      ^



if Case :
	B b = new C();
error: incompatible types: C cannot be converted to B
                B b = new C();
                      ^
--------------------------------------------------------------
*/






