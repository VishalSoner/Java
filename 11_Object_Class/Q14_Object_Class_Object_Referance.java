/*
1. Super class ka reference variable sub-class ke object ko store kar sakta he.

2. Compile time par hamesha reference variable ke corresponding check hota he, 
   Runtime par Object ke corresponding working hogi.

*/
class A
{}

class B extends A
{}

class C extends A
{}

class Q14_Object_Class_Object_Referance
{
	public static void main(String args[])
	{
		A a1 = new A();			//Compile + Run
		A a2 = new B();			//Compile + Run
		A a3 = new C();			//Compile + Run
		System.out.println("Done");
	}
}


/*

Done


--------------------------------------------------------------
*/






