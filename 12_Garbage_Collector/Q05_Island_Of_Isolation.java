class A
{
	A add;
}

class Q05_Island_Of_Isolation
{
	public static void main(String args[])
	{
		A a1 = new A();
		A a2 = new A();
		
		a1.add = a2;
		
		a1 = null;
		a2 = null;
	}
}
/*


Yaha Object ke pass reference he, But Active reference nai he.
--------------------------------------------------------
*/


