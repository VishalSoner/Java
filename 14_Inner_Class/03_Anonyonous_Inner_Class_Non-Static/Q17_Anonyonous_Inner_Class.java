class Employee
{
	void name()
	{
		System.out.println("Vishal Soner -1");
	}
	
	void salary()
	{
		System.out.println("Salary : 50,000");
	}
	
}

class Q17_Anonyonous_Inner_Class_extends
{
	public static void main(String args[])
	{
		Employee e1= new Employee();
		Employee e2= new Employee();
		Employee e3= new Employee();
		
		e1.name();
		e1.salary();
		
		e2.name();
		e2.salary();
		
		e3.name();
		e3.salary();
	}
}

/* 

Vishal Soner -1
Salary : 50,000

Vishal Soner -1
Salary : 50,000

Vishal Soner -1
Salary : 50,000

-----------------------------------------------------------------------------------------------
*/




