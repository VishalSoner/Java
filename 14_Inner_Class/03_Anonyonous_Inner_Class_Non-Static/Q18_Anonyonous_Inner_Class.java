class Employee
{
	void name()
	{
		System.out.println("Vishal");
	}
	
	void salary()
	{
		System.out.println("500");
	}
}

class Employee2 extends Employee
{
	void salary()
	{
		System.out.println("700");
	}
}

class Q18_Anonyonous_Inner_Class_extends
{
	public static void main(String args[])
	{
		Employee e1= new Employee2();
		Employee e2= new Employee2();
		Employee e3= new Employee2();
		
		e1.name();
		e1.salary();
		
		e2.name();
		e2.salary();
		
		e3.name();
		e3.salary();
	}
}

/* 

Vishal
700

Vishal
700

Vishal
700

-----------------------------------------------------------------------------------------------
*/




