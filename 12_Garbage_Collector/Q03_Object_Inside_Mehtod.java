class A
{
	void show()
	{
		System.out.println( "Class A" );
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
	}
}

class Q03_Object_Inside_Mehtod
{
	public static void main(String args[])
	{
		A a = new A();
		
		a.show();
	}
}
/*
Class A 

Local Method se bahr use nai ho sakte he or jese methdo complete execute ho jayegi 
tab Al Object GC ke pass chali jayegi.
--------------------------------------------------------
*/


