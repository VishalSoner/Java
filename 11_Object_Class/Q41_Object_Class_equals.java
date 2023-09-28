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
		Employee e = (Employee)o;
		
		if(id == e.id && name.equals(e.name) )
		{
			return true;
		}

		return false;
	}
}

class Q41_Object_Class_equals
{
	public static void main(String args[])
	{
		Employee e1 = new Employee(101, "Ram");
		Employee e2 = new Employee(102, "Sita");
		Employee e3 = new Employee(101, "Ram");
		Employee e4 = e1;
		
		System.out.println( e1.equals(e2) );
		System.out.println( e1.equals(e3) );
		System.out.println( e1.equals(e4) );
		
		// System.out.println( e3.equals(101) );
		// System.out.println( e3.equals("Ram") );
		// System.out.println( e3.equals(null) );
	}
}


/*

false
true
true

Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to Employee
Exception in thread "main" java.lang.ClassCastException: java.lang.String  cannot be cast to Employee
Exception in thread "main" java.lang.NullPointerException
--------------------------------------------------------------
*/






