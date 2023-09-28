/* instanceof keyword ka use parent - child relation me hi kar sakte he. */

class A 
{}

class B extends A 
{}

class C extends A 
{}



class Q30_Object_Class_instanceof
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		C c = new C();
		
		// 01
		// System.out.println(a instanceof A);
		// System.out.println(b instanceof A);
		// System.out.println(c instanceof A);	
		
		// 02
		// System.out.println(a instanceof B);
		// System.out.println(b instanceof B);
		// System.out.println(c instanceof B);	
		
		// 03
		System.out.println(a instanceof C);
		// System.out.println(b instanceof C);
		System.out.println(c instanceof C);
	}
}


/*
// 01
true
true
true


// 02
false
true
error: incompatible types: C cannot be converted to B
    System.out.println(c instanceof B);
                       ^


// 03
false
error: incompatible types: B cannot be converted to C
	System.out.println(b instanceof C);
                       ^
true
--------------------------------------------------------------
*/






