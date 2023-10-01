abstract class A 
{
	abstract void show1();
	abstract void show2();
}

class Q10_Anonyonous_Inner_Class_extends
{
	public static void main(String args[])
	{
		A a = new A()
		{
			void show1()
			{
				System.out.println("Anonymous Class show Method - 1");
			}
						
			void show2()
			{
				System.out.println("Anonymous Class show Method - 2");
			}
			
		};
		a.show1();
		a.show2();
		System.out.println("Main Method");
	}
}

/* 

Anonymous Class show Method - 1
Anonymous Class show Method - 2
Main Method




After Compile : 
A.class
Q10_Anonyonous_Inner_Class_extends.class
Q10_Anonyonous_Inner_Class_extends$1.class

-----------------------------------------------------------------------------------------------
*/




