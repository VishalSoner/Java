interface Inter1
{
	int cude(int x);
}

class Q31_Anonyonous_Inner_Class_implements
{
	public static void main(String args[])
	{
		int in1 = new Inter1()
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

 error: incompatible types: <anonymous Inter1> cannot be converted to int
                int in1 = new Inter1()
                          ^

-----------------------------------------------------------------------------------------------
*/







