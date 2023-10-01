abstract class A 
{
	abstract void show1();
	abstract void show2();
}

class Q09_Anonyonous_Inner_Class_extends
{
	public static void main(String args[])
	{
		A a = new A()
		{
			void show1()
			{
				System.out.println("Anonymous Class show Method");
			}
		};
		a.show1();
		System.out.println("Main Method");
	}
}

/* 

error: <anonymous Q08_Anonyonous_Inner_Class$1> is not abstract and does not override abstract method show2() in A
                {
                ^


-----------------------------------------------------------------------------------------------
*/




