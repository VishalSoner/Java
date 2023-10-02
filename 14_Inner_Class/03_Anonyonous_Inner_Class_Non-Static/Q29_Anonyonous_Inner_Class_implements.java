interface Inter1
{
	int cude(int x);
}

class Q29_Anonyonous_Inner_Class_implements
{
	public static void main(String args[])
	{
		Inter1 in1 = new Inter1()
		{
			public int cude(int x)
			{
				return x*x*x;
			}
		}.cude(10);
		
	}
}

/* 

error: incompatible types: int cannot be converted to Inter1
                }.cude(10);
                      ^

-----------------------------------------------------------------------------------------------
*/







