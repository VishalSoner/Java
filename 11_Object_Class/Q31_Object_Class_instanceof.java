/* instanceof keyword ka use parent - child relation me hi kar sakte he. */

class A 
{}

class B extends A 
{}

class C extends A 
{}



class Q31_Object_Class_instanceof
{
	public static void main(String args[])
	{
		Object o1 = new Object();
		String s1 = new String();
		StringBuffer b1 = new StringBuffer();
		
		// 01
		System.out.println(o1 instanceof Object);
		System.out.println(s1 instanceof Object);
		System.out.println(b1 instanceof Object);
		
		
		// 02
		System.out.println(o1 instanceof String);
		System.out.println(s1 instanceof String);
		// System.out.println(b1 instanceof String);


		// 03
		System.out.println(o1 instanceof StringBuffer);
		// System.out.println(s1 instanceof StringBuffer);
		System.out.println(b1 instanceof StringBuffer);
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
error: incompatible types: StringBuffer cannot be converted to String
	System.out.println(b1 instanceof String);
					   ^


// 03
false
 error: incompatible types: String cannot be converted to StringBuffer
		System.out.println(s1 instanceof StringBuffer);
                           ^
true
--------------------------------------------------------------
*/






