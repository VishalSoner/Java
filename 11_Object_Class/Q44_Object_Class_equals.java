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
		if( o instanceof Employee)
		{
			Employee e1 = (Employee)o;
			
			if( id == e1.id && name.equals(e1.name) )
				return true;
			
			else
				return false;
		}
		else
			return false;
	}
}

class Q44_Object_Class_equals
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
		
		System.out.println( e3.equals(101) );
		System.out.println( e3.equals("Ram") );
		System.out.println( e3.equals(null) );
	}
}


/*
false
true
true

false
false
false
--------------------------------------------------------------
*/






