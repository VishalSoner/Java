class A
{
	int id;
	A(int id)
	{
		this.id = id;
	}
	void show()
	{
		System.out.println("Id : " + id);
	}
}

class Q02_Reassigning_reference_Variable
{
	public static void main(String args[])
	{
		A a1 = new A(100);
		A a2 = new A(200);
		a1.show();
		a2.show();
		
		a1 = a2;
		
		a1.show();
		a2.show();

		System.out.println( a1.hashCode() );
		System.out.println( a2.hashCode() );
	}
}
/*
Id : 100
Id : 200

Id : 200
Id : 200

366712642
366712642
--------------------------------------------------------
*/


