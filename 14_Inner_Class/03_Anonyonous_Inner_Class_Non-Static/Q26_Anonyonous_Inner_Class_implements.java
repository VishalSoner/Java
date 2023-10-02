
interface Inter1
{
	void show1();
	void show2();
}

class Q26_Anonyonous_Inner_Class_implements
{
	public static void main(String args[])
	{
		Inter1 in1 = new Inter1()
		{
			public void show1()
			{
				System.out.println("Vishal Soner");
			}
		};
		
		in1.show1();
	}
}

/* 

error: <anonymous Q26_Anonyonous_Inner_Class_implements$1> is not abstract and does not override abstract method show2() in Inter1
                {
                ^
-----------------------------------------------------------------------------------------------
*/







