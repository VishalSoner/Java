class A
{
	int x, y;
	public void finalize()
	{
		System.out.println("Finalize Method : (" + x +","+y+")");
	}
}

class Q13_System_gc
{
	public static void main(String args[])
	{
		A a1 = new A();
		a1.x = 10;		a1.y = 20;
		
		A a2 = new A();
		a2.x = 101;		a2.y = 201;
	
		a1 = null;
		System.gc();
		
		a2 = null;
		System.gc();
		System.out.println("Main Method");
	}
}
/*
// 1   When Both are Accept.
Finalize Method : (10,20)
Finalize Method : (101,201)
Main Method

// 2	When Both are Accept.
Main Method
Finalize Method : (10,20)
Finalize Method : (101,201)

// 3	When Both are Accept.
Finalize Method : (10,20)
Main Method
Finalize Method : (101,201)


// 4	When a1 are Accept.
Finalize Method : (10,20)
Main Method

// 5	When a2 are Accept.
Finalize Method : (101,201)
Main Method

// 6	When Both are Rejected.
Main Method


Yaha String Class ke corresponding finalize() method call hogi OR String ke pass koi v finalize method nai he 
eshki class ki finalize method call hogi or Object class ki finalize method Empty he.
--------------------------------------------------------
*/


