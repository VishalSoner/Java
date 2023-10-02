
interface Inter1
{
	void show1();
	void show2();
}

class Q27_Anonyonous_Inner_Class_implements
{
	public static void main(String args[])
	{
		Inter1 in1 = new Inter1()
		{
			public void show1()
			{
				System.out.println("Show - 1");
			}

			public void show2()
			{
				System.out.println("Show - 2");
			}
		};
		
		in1.show1();
		in1.show2();
	}
}

/* 

Show - 1
Show - 2

-----------------------------------------------------------------------------------------------
*/







