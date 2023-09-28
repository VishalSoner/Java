class Employee
{
	int id;
	String name;
	
	public String toString()
	{
		return "Ram";
	}
}

class Q04_Object_Class_getName
{
	public static void main(String args[])
	{
		Employee e1 = new Employee();
		
		System.out.println(e1.getClass() );
		System.out.println(e1.getClass().getName() );
	}
}


/*

class Employee
Employee


--------------------------------------------------------------
*/






