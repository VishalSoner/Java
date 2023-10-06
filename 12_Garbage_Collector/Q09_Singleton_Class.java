class A
{
	static A a;
	int id;
	String name;
	private A()
	{}
	
	static A getObject()
	{
		if(a == null)
			a = new A();
			
		return a;
	}
	
	void get(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	void show()
	{
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
	}
}

class Q09_Singleton_Class
{
	public static void main(String args[])
	{
		A a1 = A.getObject();
		A a2 = A.getObject();
		A a3 = A.getObject();

		System.out.println( a1.hashCode() );
		System.out.println( a2.hashCode() );
		System.out.println( a3.hashCode() );

		
		a1.get(10, "Vishal Soner");
		a2.show();
		a3.show();
		
	}
}
/*
They are Same.
366712642
366712642
366712642

Id : 10
Name : Vishal Soner
Id : 10
Name : Vishal Soner


--------------------------------------------------------
*/


