
interface Inter1
{
	void show();
}

class Q25_Anonyonous_Inner_Class_implements
{
	public static void main(String args[])
	{
		Inter1 in1 = new Inter1()
		{
			public void show()
			{
				System.out.println("Vishal Soner");
			}
		};
		
		in1.show();
	}
}

/* 
Vishal Soner
-----------------------------------------------------------------------------------------------
*/







