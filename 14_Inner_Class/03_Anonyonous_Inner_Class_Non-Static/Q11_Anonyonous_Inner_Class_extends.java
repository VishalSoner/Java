abstract class A 
{
	abstract void show1();
}

class Q11_Anonyonous_Inner_Class_extends
{
	public static void main(String args[])
	{
		A a1 = new A()
		{
			void show1()
			{
				System.out.println("First Anonymous Class");
			}
		};

		A a2 = new A()
		{
			void show1()
			{
				System.out.println("Second Anonymous Class");
			}
		};
		
		a1.show1();
		a2.show1();
	}
}

/* 

First Anonymous Class
Second Anonymous Class



After Compile : 
A.class
Q11_Anonyonous_Inner_Class_extends.class
Q11_Anonyonous_Inner_Class_extends$1.class
Q11_Anonyonous_Inner_Class_extends$2.class

-----------------------------------------------------------------------------------------------
*/




