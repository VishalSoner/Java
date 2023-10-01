abstract class A 
{
	abstract void show();
}

class Q13_Anonyonous_Inner_Class_extends
{
	public static void main(String args[])
	{
		new A()
		{
			void show()
			{
				System.out.println("Show Method");
			}
		}.show();
	}
}

/* 

Show Method

-----------------------------------------------------------------------------------------------
*/




