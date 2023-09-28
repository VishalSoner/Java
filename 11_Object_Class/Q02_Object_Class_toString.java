
/* 

	When we print Object that time toString method is called.	( Zero parameter ).

*/

class Employee
{
	int id;
	String name;
	
	public String toString()
	{
		return "Ram";
	}
}

class Q02_Object_Class_toString
{
	public static void main(String args[])
	{
		Employee e1 = new Employee();
		
		System.out.println(e1);
		System.out.println(e1.toString() );
	}
}



/*

Ram
Ram


--------------------------------------------------------------
*/






