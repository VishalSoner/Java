class A
{}

class B extends A
{}

class C extends A
{}

class Q16_Object_Class_Object_Referance
{
	public static void main(String args[])
	{
		A a = new B();
		B b = a;
		System.out.println("Done");
	}
}


/*
error: incompatible types: A cannot be converted to B
                B b = a;
                      ^



if Case :
	A a = new B();
	B b = (B)a;			//COmpile + Run 	: 	work
Done

--------------------------------------------------------------
*/






