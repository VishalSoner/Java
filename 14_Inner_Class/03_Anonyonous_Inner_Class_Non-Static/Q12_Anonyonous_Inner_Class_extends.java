abstract class A 
{
	abstract int cube(int x);
}

class Q12_Anonyonous_Inner_Class_extends
{
	public static void main(String args[])
	{
		A a1 = new A()
		{
			int cube(int x)
			{
				return x*x*x;
			}
		};
		
		int cube1 = a1.cube(10);
		System.out.println("Cude : " + cube1);
	}
}

/* 

Cude : 1000

-----------------------------------------------------------------------------------------------
*/




