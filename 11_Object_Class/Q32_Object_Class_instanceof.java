class A 
{}

class B extends A 
{}

class C extends A 
{}



class Q32_Object_Class_instanceof
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
		System.out.println(o1 instanceof Object);
		System.out.println(s1 instanceof Object);
		System.out.println(b1 instanceof Object);


		// 03
		System.out.println(o1 instanceof Object);
		System.out.println(s1 instanceof Object);
		System.out.println(b1 instanceof Object);
	}
}


/*
// 01
true
true
true


// 02
true
true
true


// 03
true
true
true






--------------------------------------------------------------
*/






