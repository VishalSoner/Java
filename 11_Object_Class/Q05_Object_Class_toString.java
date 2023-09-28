\class Employee
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
		return "Id : " + id + ", Name : " + name ;
	}
}

class Q05_Object_Class_toString
{
	public static void main(String args[])
	{
		Employee e1 = new Employee(101, "A");
		Employee e2 = new Employee(102, "B");
		
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println(e1.toString() );
		System.out.println(e2.toString() );
	}
}


/*

Id : 101, Name : A
Id : 102, Name : B

Id : 101, Name : A
Id : 102, Name : B


--------------------------------------------------------------
*/






