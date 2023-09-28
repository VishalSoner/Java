class Employee
{
	int id;
	String name;
	
	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
}

class Q42_Object_Class_equals
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
		
		System.out.println( e1.equals(101) );
		System.out.println( e1.equals("Ram") );
		System.out.println( e1.equals(null) );
	}
}


/*

false
false
true

false
false
false
--------------------------------------------------------------
*/






