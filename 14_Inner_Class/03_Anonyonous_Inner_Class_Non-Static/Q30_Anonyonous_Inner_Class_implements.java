interface Inter1
{
	int cude(int x);
}

class Q30_Anonyonous_Inner_Class_implements
{
	public static void main(String args[])
	{
		int in1 = new Inter1()
		{
			public int cude(int x)
			{
				return x*x*x;
			}
		}.cude(10);
	
		System.out.println("Cude : " + in1 );
	}
}

/*

Cude : 1000

-----------------------------------------------------------------------------------------------
*/







