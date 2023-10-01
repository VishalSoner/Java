abstract class A 
{
	abstract int cube(int x);
}

class Q15_Anonyonous_Inner_Class_extends
{
	public static void main(String args[])
	{
		int cube_data = new A()
		{
			int cube(int x)
			{
				return x*x*x;
			}
		}.cube(5);
		
		System.out.println("Cude : " + cube_data);
	}
}

/* 

Cude : 125

-----------------------------------------------------------------------------------------------
*/




