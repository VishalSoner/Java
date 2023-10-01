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

class Q19_Anonyonous_Inner_Class_extends
{
	public static void main(String args[])
	{
		Employee e1= new Employee()
		{
			void salary()
			{
				System.out.println("700");
			}
		};
		
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

Vishal
700

Vishal
500

Vishal
500

-----------------------------------------------------------------------------------------------
*/




