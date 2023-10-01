abstract class A 
{
	abstract void show();
}

class Q08_Anonyonous_Inner_Class_extends
{
	public static void main(String args[])
	{
		A a = new A()
		{
			void show()
			{
				System.out.println("Anonymous Class show Method");
			}
		};
		a.show();
		System.out.println("Main Method");
	}
}

/* 

Anonymous Class show Method
Main Method



After Compile : 
A.class
Q10_Anonyonous_Inner_Class_extends.class
Q10_Anonyonous_Inner_Class_extends$1.class

-----------------------------------------------------------------------------------------------
*/




