class Employee
{
	int id;
	String name;
	
	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public boolean equals(Object o)
	{
		return true;
	}
}

class Q38_Object_Class_equals
{
	public static void main(String args[])
	{
		Employee e1 = new Employee(101, "Ram");
		Employee e2 = new Employee(102, "Sita");
		Employee e3 = new Employee(101, "Ram");
		
		System.out.println( e1 == e2 );
		System.out.println( e1 == e3 );
		System.out.println( e2 == e3 );
		
		System.out.println( e1.equals(e2) );
		System.out.println( e2.equals(e3) );
		System.out.println( e1.equals(e3) );
	}
}


/*

false
false
false

true
true
true



Object class ki equals method referance comparion ka kam karti he.
ham chahte he content compare ho esha purpose se equals method ko overRide karte he.
--------------------------------------------------------------
*/






