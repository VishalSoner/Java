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
		return "" + getClass().getName() + "@" + hashCode();
	}
	
	public int hashCode()
	{
		return  id;
	}
}

class Q08_Object_Class_toString
{
	public static void main(String args[])
	{
		Employee e1 = new Employee(101, "A");
		
		System.out.println(e1);
	}
}


/*

		
Employee@101

--------------------------------------------------------------
*/






