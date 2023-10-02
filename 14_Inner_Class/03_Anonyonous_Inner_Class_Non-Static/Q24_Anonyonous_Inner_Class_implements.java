
interface Inter1
{
	void show();
}

class Q24_Anonyonous_Inner_Class_implements
{
	public static void main(String args[])
	{
		Inter1 in1 = new Inter1()
		{
			void show()
			{
				System.out.println("Vishal Soner");
			}
		};
		
		in1.show();
	}
}

/* 
error: show() in <anonymous Q22_Anonyonous_Inner_Class_implements$1> cannot implement show() in Inter1
                        void show()
                             ^
-----------------------------------------------------------------------------------------------
*/