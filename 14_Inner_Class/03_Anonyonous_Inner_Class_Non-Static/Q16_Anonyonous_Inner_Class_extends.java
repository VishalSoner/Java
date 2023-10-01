abstract class A 
{
	abstract A show();
}

class Q16_Anonyonous_Inner_Class_extends
{
	public static void main(String args[])
	{
		A a = new A()
		{
			A show()
			{
				System.out.println("Show Method");
				return this;
			}
		}.show();
	}
}

/* 

show Method

-----------------------------------------------------------------------------------------------
*/




