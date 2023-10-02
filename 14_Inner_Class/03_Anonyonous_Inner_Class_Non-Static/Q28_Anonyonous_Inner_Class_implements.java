interface Inter1
{
	int cude(int x);
}

class Q28_Anonyonous_Inner_Class_implements
{
	public static void main(String args[])
	{
		Inter1 in1 = new Inter1()
		{
			public int cude(int x)
			{
				return x*x*x;
			}
		};
		
		System.out.println("Cude : " + in1.cude(10) );
	}
}

/* 

Cude : 1000

-----------------------------------------------------------------------------------------------
*/







