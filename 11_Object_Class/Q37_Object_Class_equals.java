class Employee
{
	int id;
	String name;
	
	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public String toString()
	{
		return "Id : " + id + ", Name : " + name;
	}
	
}

class Q37_Object_Class_equals
{
	public static void main(String args[])
	{
		Employee e1 = new Employee(101, "Ram");
		Employee e2 = new Employee(102, "Sita");
		Employee e3 = new Employee(101, "Ram");
		
		System.out.println( e1 );
		System.out.println( e2 );
		System.out.println( e3 );
		
		System.out.println( e1 == e2 );
		System.out.println( e1 == e3 );
		System.out.println( e2 == e3 );
		
		System.out.println( e1.equals(e2) );
		System.out.println( e2.equals(e3) );
		System.out.println( e1.equals(e3) );
	}
}


/*

Id : 101, Name : Ram
Id : 102, Name : Sita
Id : 101, Name : Ram

false
false
false

false
false
false


--------------------------------------------------------------
*/






