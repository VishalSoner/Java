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
		return "" + getClass().getName() + "@" + Integer. toHexString( hashCode() );
	}
	
	public int hashCode()
	{
		return  id;
	}
}

class Q09_Object_Class_toString
{
	public static void main(String args[])
	{
		Employee e1 = new Employee(101, "A");
		
		System.out.println(e1);
	}
}


/*

		
Employee@65



Employee   @  	65
class_Name @ Hexa_Decomal_Number

--------------------------------------------------------------
*/






